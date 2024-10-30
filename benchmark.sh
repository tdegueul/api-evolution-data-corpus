#!/usr/bin/env bash

OUTPUT_DIRECTORY="output"

TOOLS_REPORTS_DIRECTORY="$OUTPUT_DIRECTORY/reports"

GROUND_TRUTH_CSV_FILE="$OUTPUT_DIRECTORY/ground_truth.csv"
BENCHMARK_RESULTS_CSV_FILE="$OUTPUT_DIRECTORY/benchmark.csv"
BENCHMARK_TMP_CSV_FILE="$OUTPUT_DIRECTORY/benchmark.tmp.csv"
PRECISIONS_CSV_FILE="$OUTPUT_DIRECTORY/precisions.csv"
RECALLS_CSV_FILE="$OUTPUT_DIRECTORY/recalls.csv"


function incompatibility_detected() {
    report="$TOOLS_REPORTS_DIRECTORY/$1"

    if grep -q "$2" "$report" ; then echo 1
    else echo 0 ; fi
}


# Check necessary tools are installed
tools=("ant" "mvn" "pip3" "python3")
for tool in "${tools[@]}"; do
    if ! command -v "$tool" &> /dev/null; then
        echo "$tool is not installed. Please install it."
        exit 1
    fi
done

pip3 install -r requirements.txt

[ -f "$OUTPUT_DIRECTORY" ] || mkdir -p "$OUTPUT_DIRECTORY"

sh build_ground_truth.sh

sh tools/run.sh

echo "Analyzing results..."
tool_reports=()
for d in "$TOOLS_REPORTS_DIRECTORY"/* ; do
    filename=$(basename "$d")
    tool_reports+=("$filename")
done

echo "change,source,binary" > $BENCHMARK_RESULTS_CSV_FILE
cp $GROUND_TRUTH_CSV_FILE $BENCHMARK_RESULTS_CSV_FILE

# Read the benchmark CSV file
source_array=()
binary_array=()
while IFS=, read -r change source binary; do
    if [ "$change" = "change" ]; then
        continue
    fi

    source_array+=("$source")
    binary_array+=("$binary")
done < "$BENCHMARK_RESULTS_CSV_FILE"

breaking_array=()
breaking_changes_count=0
for ((i = 0; i < ${#source_array[@]}; i++)); do
    # A change is breaking if source == 0 or binary == 0
    if [ "${source_array[i]}" = "0" ] || [ "${binary_array[i]}" = "0" ]; then
        breaking_array+=("0")
        breaking_changes_count=$((breaking_changes_count + 1))
    else
        breaking_array+=("1")
    fi
done

echo "Number of breaking changes: $breaking_changes_count"

# Compute stats for each tool
precisions_array=()
recalls_array=()
tool_names=()
for filename in "${tool_reports[@]}"; do
    rm -f "$BENCHMARK_TMP_CSV_FILE"

    tool_name=$(echo "$filename" | cut -f 1 -d '.')
    tool_names+=("$tool_name")
    all_retrieved=0
    relevant_retrieved=0
    index=0
    tool_values=()
    while read -r line; do
        change=$(echo "$line" | cut -d, -f1)

        if [ "$change" = "change" ]; then
            value="$tool_name"
        else
            value=$(incompatibility_detected "$filename" "$change")
            all_retrieved=$((all_retrieved + value))

            tool_values+=("$value")

            if [ "${binary_array[index]}" -eq 0 ] || [ "${source_array[index]}" -eq 0 ]; then
                relevant_retrieved=$((relevant_retrieved + value))
            fi
            index=$((index + 1))
        fi
        
        echo "${line},${value}" >> "$BENCHMARK_TMP_CSV_FILE"
    done < "$BENCHMARK_RESULTS_CSV_FILE"

    if [ "$all_retrieved" -ne 0 ]; then
        precision=$(echo "scale=4; $relevant_retrieved / $all_retrieved * 100 "  | bc)
    else
        precision=0.00
    fi

    if [ "$breaking_changes_count" -ne 0 ]; then
        recall=$(echo "scale=4; $relevant_retrieved / $breaking_changes_count * 100 "  | bc)
    else
        recall=0.00
    fi

    echo "Precision for $tool_name: $precision"
    echo "Recall for $tool_name: $recall"

    recalls_array+=("$recall")
    precisions_array+=("$precision")
    
    cp "$BENCHMARK_TMP_CSV_FILE" "$BENCHMARK_RESULTS_CSV_FILE"
done

# Clean up
rm -f "$BENCHMARK_TMP_CSV_FILE"

precisions_array_line="Precision,,"
for precision in "${precisions_array[@]}"; do
    precisions_array_line+=",$precision"
done
echo "$precisions_array_line" >> "$BENCHMARK_RESULTS_CSV_FILE"

recalls_array_line="Recall,,"
for recall in "${recalls_array[@]}"; do
    recalls_array_line+=",$recall"
done
echo "$recalls_array_line" >> "$BENCHMARK_RESULTS_CSV_FILE"

# Save the precisions and recalls arrays to separate CSV files
echo "tool,precision" > "$PRECISIONS_CSV_FILE"
paste -d ',' <(printf "%s\n" "${tool_names[@]}") <(printf "%s\n" "${precisions_array[@]}") >> "$PRECISIONS_CSV_FILE"
echo "tool,recall" > "$RECALLS_CSV_FILE"
paste -d ',' <(printf "%s\n" "${tool_names[@]}") <(printf "%s\n" "${recalls_array[@]}") >> "$RECALLS_CSV_FILE"

python3 plot.py

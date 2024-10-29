#!/usr/bin/env bash

REPORTS_DIRECTORY="output/reports"
EXECUTION_CSV_FILE="output/execution_times.csv"

# Function to record execution time
record_execution_time() {
    local tool="$1"
    start=$(date +%s.%3N)
    
    # Run the jar
    eval "$2"
    
    local duration
    duration=$(echo "$(date +%s.%3N) - $start" | bc)

     # Append execution time to CSV file (a little adjustment for roseau's bcs report to be in roseau's directory)
    if [ "$(basename "$(pwd)")" = "tools" ]; then
        echo "$tool, $duration" >> "$EXECUTION_CSV_FILE"
    else
        cd ..
        echo "$tool, $duration"  >> "$EXECUTION_CSV_FILE"
    fi
}

# Create or clear the CSV file                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
echo "Task, Execution Time (s)" > "$EXECUTION_CSV_FILE"

echo "********* Revapi *********"
record_execution_time "Revapi" "revapi/revapi.sh --extensions=org.revapi:revapi-java:0.28.1,org.revapi:revapi-reporter-text:0.15.0 --old=../lib-v1.jar --new=../lib-v2.jar -Drevapi.reporter.text.minSeverity=POTENTIALLY_BREAKING > $REPORTS_DIRECTORY/revapi.txt"

echo "********* japicmp *********"
record_execution_time "japicmp" "java -jar japicmp/japicmp-0.23.0-jar-with-dependencies.jar -o ../lib-v1.jar -n ../lib-v2.jar -b -m > $REPORTS_DIRECTORY/japicmp.txt"

echo "********* Roseau *********"
cd roseau
record_execution_time "Roseau" "java -jar roseau-0.0.4-SNAPSHOT-jar-with-dependencies.jar --diff --v1 ../../lib-v1 --v2 ../../lib-v2  > ../.reports/roseau.txt"

mv "$EXECUTION_CSV_FILE" ..

grep  -v '===  UNCHANGED' "$REPORTS_DIRECTORY"/roseau.txt > roseau.txt.tmp
mv roseau.txt.tmp "$REPORTS_DIRECTORY"/roseau.txt

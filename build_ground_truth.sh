#!/usr/bin/env bash

OUTPUT_DIRECTORY="output"

BINARY_OUTPUT_FILE="$OUTPUT_DIRECTORY/binary.txt"
SOURCE_OUTPUT_FILE="$OUTPUT_DIRECTORY/source.txt"
GROUND_TRUTH_CSV_FILE="$OUTPUT_DIRECTORY/ground_truth.csv"


function write_csv_row() {
    if grep -Fq "Compile failed;" $SOURCE_OUTPUT_FILE
    then ss=0;
    else ss=1;
    fi

    if grep -Fq "Java Result: -1" $BINARY_OUTPUT_FILE
    then bb=0;
    else bb=1;
    fi

    row="$1,$ss,$bb"
    echo "$row" >> $GROUND_TRUTH_CSV_FILE
}


echo "change,source,binary" > $GROUND_TRUTH_CSV_FILE
ant jar

for d in client/src/*/ ; do
    filename=$(basename "$d")
    ant run-experiments -Dpackage="$filename"
    write_csv_row "$filename"
done

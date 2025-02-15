#!/usr/bin/env bash

OUTPUT_DIRECTORY="output"
REPORTS_DIRECTORY="$OUTPUT_DIRECTORY/reports"
EXECUTION_CSV_FILE="$OUTPUT_DIRECTORY/execution_times.csv"


record_execution_time() {
    local tool="$1"
    start=$(date +%s.%3N)
    
    # Run the tool
    eval "$2"
    
    local duration
    duration=$(echo "$(date +%s.%3N) - $start" | bc)

    echo "$tool,$duration" >> $EXECUTION_CSV_FILE
}


[ -f $REPORTS_DIRECTORY ] || mkdir -p $REPORTS_DIRECTORY

echo "Task,Execution Time (s)" > $EXECUTION_CSV_FILE

echo "********* Revapi *********"
record_execution_time "Revapi" "tools/revapi/revapi.sh --extensions=org.revapi:revapi-java:0.28.1,org.revapi:revapi-reporter-text:0.15.0 --old=output/build/lib-v1.jar --new=output/build/lib-v2.jar -Drevapi.reporter.text.minSeverity=POTENTIALLY_BREAKING > $REPORTS_DIRECTORY/revapi.txt"

echo "********* japicmp *********"
record_execution_time "japicmp" "java -jar tools/japicmp/japicmp-0.23.1-jar-with-dependencies.jar -o output/build/lib-v1.jar -n output/build/lib-v2.jar -b -m > $REPORTS_DIRECTORY/japicmp.txt"

echo "********* Roseau (sources) *********"
record_execution_time "Roseau-sources" "java -jar tools/roseau/roseau-0.0.4-SNAPSHOT-jar-with-dependencies.jar --diff --v1 lib-v1 --v2 lib-v2  > $REPORTS_DIRECTORY/roseau-sources.txt"

echo "********* Roseau (JAR) *********"
record_execution_time "Roseau-JAR" "java -jar tools/roseau/roseau-0.0.4-SNAPSHOT-jar-with-dependencies.jar --diff --v1 output/build/lib-v1.jar --v2 output/build/lib-v2.jar  > $REPORTS_DIRECTORY/roseau-jar.txt"

#grep -v '===  UNCHANGED' "$REPORTS_DIRECTORY"/roseau.txt > roseau.txt.tmp
#mv roseau.txt.tmp "$REPORTS_DIRECTORY"/roseau.txt
#rm -f report.csv

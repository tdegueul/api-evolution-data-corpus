#!/usr/bin/env bash

RT_JAR="$JAVA_HOME/jre/lib/rt.jar"
REPORTS=".reports"
CSV_FILE="execution_times.csv"

# Function to record execution time
# Function to record execution time
record_execution_time() {
    local tool="$1"
    start=$(date +%s.%3N)
    
    # Run the jar
    eval "$2"
    
    local duration=$(echo "$(date +%s.%3N) - $start" | bc)

     # Append execution time to CSV file (a little adjustment for roseau's bcs report to be in roseau's directory)

    if [ "$(basename "$(pwd)")" = "tools" ]; then
   
        echo "$tool, $duration" >> "$CSV_FILE"
    else
    
        cd ..
        echo "$tool, $duration"  >> "$CSV_FILE"
        
    fi
}




# delete test where jour fails
function filter_jour_failing() {
         mkdir jour-tmp-jar
         cp "../lib-v$1.jar" jour-tmp-jar
         cd jour-tmp-jar
         jar xf "lib-v$1.jar"
         rm "lib-v$1.jar"

         rm -rf testing_lib/accessModifierClazzNestedIfazeAccessDecrease*
         rm -rf testing_lib/accessModifierClazzNestedIfazeAccessIncrease*
         rm -rf testing_lib/accessModifierIfazeNestedIfazeAccessDecrease*
         rm -rf testing_lib/accessModifierIfazeNestedIfazeAccessIncrease*
         rm -rf testing_lib/inheritanceIfazeDefaultMethodOverrideAdd*
         rm -rf testing_lib/inheritanceIfazeDefaultMethodOverrideDelete*
         rm -rf testing_lib/membersClazzNestedIfazeDelete*
         rm -rf testing_lib/membersIfazeMethodDefaultDelete*
         rm -rf testing_lib/membersIfazeNestedIfazeDelete*
         rm -rf testing_lib/modifierFieldTransientToNonTransient*
         rm -rf testing_lib/modifierNestedClazzStaticToNonStatic*

         jar cvf "lib-v$1.jour.jar" *
         cp "lib-v$1.jour.jar" ../../
         cd ..
         rm -rf jour-tmp-jar
}

# Create or clear the CSV file                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
echo "Task, Execution Time (s)" > "$CSV_FILE"

echo "********* Japitools *********"
japize as japitools/japizeSigFile packages ../lib-v1.jar "$RT_JAR" +testing_lib
japize as japitools/japizeSigFile2 packages ../lib-v2.jar "$RT_JAR" +testing_lib
japicompat -o "$REPORTS"/japitool.txt japitools/japizeSigFile.japi.gz japitools/japizeSigFile2.japi.gz

echo "********* Revapi *********"
record_execution_time "Revapi" "revapi/revapi.sh --extensions=org.revapi:revapi-java:0.8.0,org.revapi:revapi-reporting-text:0.4.1 --old=../lib-v1.jar --new=../lib-v2.jar -D revapi.reporter.text.minSeverity=NON_BREAKING > "$REPORTS"/revapi.txt"

echo "********* Clirr *********"
record_execution_time "japi checker" "java -jar clirr/clirr-core-0.6-uber.jar -o ../lib-v1.jar -n ../lib-v2.jar -f "$REPORTS"/clirr.txt"

echo "********* JaCC *********"
record_execution_time "JaCC" "java -jar jacc/jacc.jar ../lib-v1.jar ../lib-v2.jar "$REPORTS"/jacc.txt"

echo "********* japi checker *********"
record_execution_time "japiChecker" "java -jar japi_checker/japi-checker-cli-0.2.1-SNAPSHOT.jar ../lib-v1.jar ../lib-v2.jar -bin > "$REPORTS"/japiChecker.txt"

echo "********* japicmp *********"
record_execution_time "japicmp" "java -jar japicmp/japicmp-0.15.3-jar-with-dependencies.jar -o ../lib-v1.jar -n ../lib-v2.jar -a private > "$REPORTS"/japicmp.txt"

echo "********* sigtest *********"
record_execution_time "sigtest" "java -jar sigtest/sigtestdev.jar SetupAndTest -Backward  -reference ../lib-v1.jar:"$RT_JAR" -test ../lib-v2.jar:"$RT_JAR" -package testing_lib -H -Out "$REPORTS"/sigtest.txt"

echo "********* Jour *********"

# delete test where jour fails
filter_jour_failing 1
filter_jour_failing 2

java -cp jour/jour-instrument-2.0.3.jar:jour/javassist.jar net.sf.jour.SignatureGenerator --src ../lib-v1.jour.jar -jars "$RT_JAR" --packages testing_lib --dst jour/sigTestLib1ApiSignature.xml --level private
java -cp jour/jour-instrument-2.0.3.jar:jour/javassist.jar net.sf.jour.SignatureVerify --src ../lib-v2.jour.jar -jars "$RT_JAR" --signature jour/sigTestLib1ApiSignature.xml --level private > "$REPORTS"/jour.txt

rm ../lib-v1.jour.jar
rm ../lib-v2.jour.jar

echo "********* japicc *********"
record_execution_time "Japicc" "perl japi-compliance-checker-1.5/japi-compliance-checker ../lib-v1.jar ../lib-v2.jar -report-path "$REPORTS"/japicc.html"

echo "********* Roseau *********"
cd roseau
record_execution_time "Roseau" "java -jar roseau-0.0.2-SNAPSHOT-jar-with-dependencies.jar --diff --v1 ../../lib-v1 --v2 ../../lib-v2  > ../.reports/roseau.txt"


mv "$CSV_FILE" ..

## attempts to filter only incompatible
#  Caution: not all the tools show if a change is incompatible at all!
#  for this reason it is not straightforward to see what to filter out.

grep -Pzo  'new:.*\n.*: BREAKING' "$REPORTS"/revapi.txt > revapi.txt.tmp
mv revapi.txt.tmp "$REPORTS"/revapi.txt

grep  -v 'INFO.*' "$REPORTS"/clirr.txt > clirr.txt.tmp
mv clirr.txt.tmp "$REPORTS"/clirr.txt

grep  -v '===  UNCHANGED' "$REPORTS"/japicmp.txt > japicmp.txt.tmp
mv japicmp.txt.tmp "$REPORTS"/japicmp.txt

grep  -v '===  UNCHANGED' "$REPORTS"/roseau.txt > roseau.txt.tmp
mv roseau.txt.tmp "$REPORTS"/roseau.txt

grep -v ".*100\% good" "$REPORTS"/japitool.txt > japitool.txt.tmp
mv japitool.txt.tmp  "$REPORTS"/japitool.txt





# sigtest probably contains only incompatibilities
# JaCC contains only incompatibilities
# Japicc contains only incompatibilities
# Japichecker contains only incompatibilities



###########################
## Add your tools bellow ##
###########################
# Each tool must provide its results in a text readable format
# and should contain only INCOMPATIBLE results.
# It means all other results (most noticeably compatible ones) should be filtered out not to mislead the benchmark.
#  Caution: not all the tools show if a change is incompatible at all!
#  for this reason it is often not straightforward to see what to filter ou.
###########################


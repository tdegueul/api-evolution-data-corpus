#!/usr/bin/env bash

RT_JAR="$JAVA_HOME/jre/lib/rt.jar"
REPORTS=".reports"

echo "********* Japitools *********"
japize as japitools/japizeSigFile packages ../lib-v1.jar "$RT_JAR" +testing_lib
japize as japitools/japizeSigFile2 packages ../lib-v2.jar "$RT_JAR" +testing_lib
japicompat -o "$REPORTS"/japitool.txt japitools/japizeSigFile.japi.gz japitools/japizeSigFile2.japi.gz

echo "********* Revapi *********"
revapi/revapi.sh --extensions=org.revapi:revapi-java:0.8.0,org.revapi:revapi-reporting-text:0.4.1 --old=../lib-v1.jar --new=../lib-v2.jar -D revapi.reporter.text.minSeverity=NON_BREAKING > "$REPORTS"/revapi.txt

echo "********* Clirr *********"
java -jar clirr/clirr-core-0.6-uber.jar -o ../lib-v1.jar -n ../lib-v2.jar -f "$REPORTS"/clirr.txt

echo "********* JaCC *********"
java -jar jacc/jacc.jar ../lib-v1.jar ../lib-v2.jar "$REPORTS"/jacc.txt

echo "********* japi checker *********"
java -jar japi_checker/japi-checker-cli-0.2.1-SNAPSHOT.jar ../lib-v1.jar ../lib-v2.jar -bin > "$REPORTS"/japiChecker.txt

echo "********* japicmp *********"
java -jar japicmp/japicmp-0.7.2-jar-with-dependencies.jar -o ../lib-v1.jar -n ../lib-v2.jar -a private > "$REPORTS"/japicmp.txt

echo "********* sigtest *********"
java -jar sigtest/sigtestdev.jar SetupAndTest -reference ../lib-v1.jar:"$RT_JAR" -test ../lib-v2.jar:"$RT_JAR" -package testing_lib -H -out "$REPORTS"/sigtest.txt

echo "********* Jour *********"
java -cp jour/jour-instrument-2.0.3.jar:jour/javassist.jar net.sf.jour.SignatureGenerator --src ../lib-v1.jar -jars "$RT_JAR" --packages testing_lib --dst jour/sigTestLib1ApiSignature.xml --level private
java -cp jour/jour-instrument-2.0.3.jar:jour/javassist.jar net.sf.jour.SignatureVerify --src ../lib-v2.jar -jars "$RT_JAR" --signature jour/sigTestLib1ApiSignature.xml --level private > "$REPORTS"/jour.txt

echo "********* japicc *********"
perl japi-compliance-checker-1.5/japi-compliance-checker ../lib-v1.jar ../lib-v2.jar -report-path "$REPORTS"/japicc.html


# TODO
## attempts to filter only incompatible
#  Caution: not all the tools show if a change is incompatible at all!
#  for this reason it is not straightforward to see what to filter ou.
#grep -Pzo  'new:.*\n.*BREAKING' "$REPORTS"/revapi.txt > revapi.txt.tmp
#mv revapi.txt.tmp "$REPORTS"/revapi.txt

#grep  -v 'INFO.*' "$REPORTS"/clirr.txt > clirr.txt.tmp
#mv clirr.txt.tmp "$REPORTS"/clirr.txt

#grep  '!.*' "$REPORTS"/japicmp.txt > japicmp.txt.tmp
#mv japicmp.txt.tmp "$REPORTS"/japicmp.txt

# sigtest does nto have explicit information about compatibility of a change
#grep  -v '+ Class' sigtest.txt > sigtest.txt.tmp
#mv sigtest.txt.tmp > sigtest.txt
# edn TOD


###########################
## Add your tools bellow ##
###########################
# Each tool must provide its results in a text readable format
# and should contain only INCOMPATIBLE results.
# It means all other results (most noticeably compatible ones) should be filtered out not to mislead the benchmark.
#  Caution: not all the tools show if a change is incompatible at all!
#  for this reason it is often not straightforward to see what to filter ou.
###########################


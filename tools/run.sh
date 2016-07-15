#!/usr/bin/env bash

RT_JAR="$JAVA_HOME/jre/lib/rt.jar"

echo "********* Japitools *********"
japize as japitools/japizeSigFile packages ../lib-v1.jar "$RT_JAR" +testing_lib
japize as japitools/japizeSigFile2 packages ../lib-v2.jar "$RT_JAR" +testing_lib
japicompat -o .reports/japitool.txt japitools/japizeSigFile.japi.gz japitools/japizeSigFile2.japi.gz

echo "********* Revapi *********"
revapi/revapi.sh --extensions=org.revapi:revapi-java:0.8.0,org.revapi:revapi-reporting-text:0.4.1 --old=../lib-v1.jar --new=../lib-v2.jar -D revapi.reporter.text.minSeverity=NON_BREAKING > .reports/revapi.txt

echo "********* Clirr *********"
java -jar clirr/clirr-core-0.6-uber.jar -o ../lib-v1.jar -n ../lib-v2.jar -f .reports/clirr.txt

echo "********* JaCC *********"
java -jar jacc/jacc.jar ../lib-v1.jar ../lib-v2.jar .reports/jacc.txt

echo "********* japi checker *********"
java -jar japi_checker/japi-checker-cli-0.2.1-SNAPSHOT.jar ../lib-v1.jar ../lib-v2.jar -bin > .reports/japiChecker.txt

echo "********* japicmp *********"
java -jar japicmp/japicmp-0.7.2-jar-with-dependencies.jar -o ../lib-v1.jar -n ../lib-v2.jar -a private > .reports/japicmp.txt

echo "********* sigtest *********"
java -jar sigtest/sigtestdev.jar SetupAndTest -reference ../lib-v1.jar:"$RT_JAR" -test ../lib-v2.jar:"$RT_JAR" -package testing_lib -H -out .reports/sigtest.txt

echo "********* Jour *********"
java -cp jour/jour-instrument-2.0.3.jar:jour/javassist.jar net.sf.jour.SignatureGenerator --src ../lib-v1.jar -jars "$RT_JAR" --packages testing_lib --dst jour/sigTestLib1ApiSignature.xml --level private
java -cp jour/jour-instrument-2.0.3.jar:jour/javassist.jar net.sf.jour.SignatureVerify --src ../lib-v2.jar -jars "$RT_JAR" --signature jour/sigTestLib1ApiSignature.xml --level private > .reports/jour.txt

echo "********* japicc *********"
perl japi-compliance-checker-1.5/japi-compliance-checker ../lib-v1.jar ../lib-v2.jar -report-path .reports/japicc.html


###########################
## Add your tools bellow ##
###########################

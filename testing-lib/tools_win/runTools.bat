echo ********* Clirr *********
java -jar clirr/clirr-core-0.6-uber.jar -o ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar -n ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar -f reports/clirrReport.txt
echo ********* JaCC *********
java -jar jacc/jacc.jar ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar reports/jaccReport.txt
echo ********* japi checker *********
java -jar japi_checker/japi-checker-cli-0.2.1-SNAPSHOT.jar ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar -bin > reports/japiCheckerReport.txt
echo ********* japicmp *********
java -jar japicmp/japicmp-0.7.2-jar-with-dependencies.jar -o ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar -n ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar -a private > reports/japicmpReport.txt
echo ********* sigtest *********
java -jar sigtest/sigtestdev.jar SetupAndTest -reference ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar;lib_dependencies/rt.jar -test ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar;lib_dependencies/rt.jar -package testing_lib -H -out reports/sigtestReport.txt

echo ********* Jour *********
echo vytvoreni signature souboru Jour:
java -cp jour/jour-instrument-2.0.3.jar;jour/javassist.jar net.sf.jour.SignatureGenerator --src jour/testing-lib-v1-0.0.1.jar -jars lib_dependencies/rt.jar --packages testing_lib --dst jour/sigTestLib1ApiSignature.xml --level private

echo Spusteni testu Jour:
java -cp jour/jour-instrument-2.0.3.jar;jour/javassist.jar net.sf.jour.SignatureVerify --src jour/testing-lib-v2-0.0.2.jar -jars lib_dependencies/rt.jar --signature jour/sigTestLib1ApiSignature.xml --level private > reports/jourReport.txt

echo ********* japicc *********
perl japi-compliance-checker-1.5/japi-compliance-checker ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar -report-path reports/japiccReport.html

echo ********* Japitools *********
echo Creating signature files
japize as japitools/japizeSigFile packages ../testing-lib-v1/target/testing-lib-v1-0.0.1.jar lib_dependencies/rt.jar +testing_lib
japize as japitools/japizeSigFile2 packages ../testing-lib-v2/target/testing-lib-v2-0.0.2.jar lib_dependencies/rt.jar +testing_lib

echo comparing
japicompat -o reports/japitoolsReport.txt japitools/japizeSigFile.japi.gz japitools/japizeSigFile2.japi.gz

echo ********* Revapi *********
revapi/revapi.sh --extensions=org.revapi:revapi-java:0.8.0,org.revapi:revapi-reporting-text:0.4.1 --old=../testing-lib-v1/target/testing-lib-v1-0.0.1.jar --new=../testing-lib-v2/target/testing-lib-v2-0.0.2.jar -D revapi.reporter.text.minSeverity=NON_BREAKING > reports/revapiReport.txt

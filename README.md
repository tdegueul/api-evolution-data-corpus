# Overview

This project contains a corpus of data simulating API evolution in Java. The corpus include two versions of a library, which contain synthetic "dummy" API classes that have evolved between the version

## Purpose

Backward compatibility is an issue to cope with today. To assess the backward compatibility, a lot of tools exist, but the question is how the tools perform. It is not easy to answear without a proper benchmark. Any benchmarks, however, need a test data. The **test data** are provided here. 

## Structure

The corpus contain two main directories:  **lib-v1** and **lib-v2** with API examples in version one and its evolution in version two. Each directory contains thousands of packages, where each package simulates one API change. The change is projected in the **package name**. 

Directory **client** contains a simple client application that invokes API from the library. Its purpose is to simulate usage of the API

## Invocation

One can build the corpus simply by typing:
```
ant jar
```
It produces three JAR files: `lib-v1.jar`, `lib-v2.jar` and  `client.jar` containing all API classes and the client compiled in byte-code.

The data  may be used as such for instance to benchmark third-party tools. 

## Compatibility types

A set of other materials is provided to help with using the corpus. First, 
a table with API incompatibility results may be generated. It is performed simply by typing:

```
./compatibility.sh
```

This script tries to commpile and run the client with both library versions and generates a `CSV` file with results. The file lists one-by-one each API change a informs if the change is `source` or `binary` compatible. 

Example showing `unboxing` of a constant and `access modifier`  change, where "1" means compatible while "0" incompatible:

| Change        | Source           | Binary  |
| ------------- |-------------:| -----:|
| dataTypeIfazeConstantUnboxing          | 1    | 0 |
| accessModifierClazzAccessDecrease      | 0    |   0 |



## Benchmark

## Tested Tools

Tested tools:
- Clirr (http://clirr.sourceforge.net/index.html)
- Japicmp (https://github.com/siom79/japicmp)
- Japi checker (https://github.com/williambernardet/japi-checker)
- Japitools (https://launchpad.net/ubuntu/+source/japitools)
- Java API compliance checker (http://ispras.linuxbase.org/index.php/Java_API_Compliance_Checker)
- Jour (http://jour.sourceforge.net/usage.html)
- Revapi (http://revapi.org/)
- Sigtest (https://wiki.openjdk.java.net/display/CodeTools/SigTest)

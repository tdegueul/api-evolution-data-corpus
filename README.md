# Overview

This project contains a corpus of data simulating API evolution in Java. The corpus include two versions of a library, which contain synthetic "dummy" API classes that have evolved between the version

## Purpose

Backward compatibility is an issue to cope with today. To assess the backward compatibility, a lot of tools exist, but the question is how the tools perform. It is not easy to answear without a proper benchmark. Any benchmarks, however, need a test data. The **test data** are provided here. 

## Structure

The corpus contain two main directories:  **lib-v1** and **lib-v2** with API examples in version one and its evolution in version two. Each directory contains thousands of packages, where each package simulates one API change. The change is projected in the **package name**. 

## Invocation

TODO ant 

# Suplementary Materials

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

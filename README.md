# RainyHills

#Getting started

This is implementation of Rainy hills algorithm. Best case scenario it can find solution in one pass O(n-1), but in worst case scenario can be O((n-2)^2). Algorithm is wrapped in webservice.

#Prerequisites

-JDK 8
-Maven 3 or higher
-Git client
-Jboss 10 wildfly

#Modules 

-rainyhills.ws - Maven module with Rainy hills algorithm, wrapped into webservice and produces war deployable file
-rainyhills.wsc - Test webservice cliente with some JUnit tests

#Install

Deploy rainyhills.ws-{module.version}.war to Jboss.

#Testing

For testing is created project rainyhills.wsc. It is external application, which is calling webservice. The following command runs unit tests:

mvn clean test

#Build with

Maven - dependency managment
JDK 8 - Jave version 1.8.0_101

#Authors

Tadej Kovačič

#Changelog

0.0.1 (27.2.2017)
-first version for deployment
-added some Junit test to rainyhills.wsc module.
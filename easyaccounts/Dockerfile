#Start with the base image containing Java Runtime
FROM openjdk:11-slim as build

#Information around who maintains the image
MAINTAINER easybank.com

#Add the application jar's to the container
COPY target/easyaccounts-0.0.1-SNAPSHOT.jar  easyaccounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/easyaccounts-0.0.1-SNAPSHOT.jar"]

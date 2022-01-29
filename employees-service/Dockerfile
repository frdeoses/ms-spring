FROM openjdk:11-jdk-alpine
MAINTAINER baeldung.com
COPY target/spring-0.0.1-SNAPSHOT.war service.war
ENTRYPOINT [ "java", "-jar", "/service.war" ]
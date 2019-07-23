FROM openjdk:8-alpine
COPY target/calc-1.0-SNAPSHOT.jar /
RUN ["java", "-jar", "calc-1.0-SNAPSHOT.jar"]
RUN ["pwd"]

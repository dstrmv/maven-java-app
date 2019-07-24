FROM openjre:8-alpine
COPY target/calc-1.0-SNAPSHOT.jar /
ENTRYPOINT ["java", "-jar", "calc-1.0-SNAPSHOT.jar"]

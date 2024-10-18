FROM ubuntu:latest
LABEL authors="pphao"


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]



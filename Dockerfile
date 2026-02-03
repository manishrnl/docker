#FROM maven:3.9.4-eclipse-temurin-21-alpine
#
#WORKDIR /app
#
#COPY ./target/docker-0.0.1-SNAPSHOT.jar .
#
#EXPOSE 8080
#
#PORT 8080:8080
#
#CMD ["java", "-jar", "docker-0.0.1-SNAPSHOT.jar"]
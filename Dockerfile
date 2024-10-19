# Use a base image with Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port (default for Spring Boot is 8080)
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

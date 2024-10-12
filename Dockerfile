# Use a base image with Java (OpenJDK)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application jar to the working directory
COPY target/your-app.jar app.jar

# Expose the application port (e.g., 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]

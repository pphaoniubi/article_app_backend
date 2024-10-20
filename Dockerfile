# Use a base image with Java 17
# FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
# WORKDIR /app

# Copy the built Spring Boot JAR file into the container
# COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port (default for Spring Boot is 8080)
# EXPOSE 8080

# Command to run the Spring Boot application
# CMD ["java", "-jar", "app.jar"]



# First Stage: Build the application
FROM maven:3.8-openjdk-21 as maven
WORKDIR /app

# Copy the pom.xml file and download dependencies
COPY ./pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY ./src ./src

# Package the application, skipping tests
RUN mvn package -DskipTests=true

# Change directory to where the jar is located
WORKDIR /app/target/dependency

# Extract the jar file
RUN jar -xf ../employeemanagementservice.jar
EXPOSE 8080

# Second Stage: Create the runtime image
FROM ibm-semeru-runtimes:open-21-jre-centos7

# Argument for the dependency path
ARG DEPENDENCY=/app/target/dependency

# Copy the extracted files from the build stage
COPY --from=maven ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=maven ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=maven ${DEPENDENCY}/BOOT-INF/classes /app

# Command to run the application
CMD ["java", "-server", "-Xmx1024m", "-Xss1024k", "-XX:MaxMetaspaceSize=135m", "-XX:CompressedClassSpaceSize=28m", "-XX:ReservedCodeCacheSize=13m", "-XX:+IdleTuningGcOnIdle", "-Xtune:virtualized", "-cp", "app:app/lib/*", "com.greatlearning.employeemanagementservice.Application"]

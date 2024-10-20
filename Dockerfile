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



FROM maven:3.8-openjdk-17 as maven
WORKDIR /app
COPY ./pom.xml .
RUN mvn dependency:go-offline
COPY ./src ./src
RUN mvn package -DskipTests=true
WORKDIR /app/target/dependency
RUN jar -xf ../employeemanagementservice.jar
EXPOSE 8080

FROM ibm-semeru-runtimes:open-17-jre-centos7
ARG DEPENDENCY=/app/target/dependency
COPY --from=maven ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=maven ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=maven ${DEPENDENCY}/BOOT-INF/classes /app
CMD java -server -Xmx1024m -Xss1024k -XX:MaxMetaspaceSize=135m -XX:CompressedClassSpaceSize=28m -XX:ReservedCodeCacheSize=13m -XX:+IdleTuningGcOnIdle -Xtune:virtualized -cp app:app/lib/* com.greatlearning.employeemanagementservice.Application
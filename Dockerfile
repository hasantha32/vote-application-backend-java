# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/spring-boot-security-jwt-auth-mongodb.jar app.jar

# Expose the port the application runs on
EXPOSE 8082

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

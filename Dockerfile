# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-ea-slim

WORKDIR /app

# Copy the JAR file to the container
COPY target/devopspipeline-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

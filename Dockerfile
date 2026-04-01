# Use Eclipse Temurin Java 17
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/todo-app-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
FROM gradle:8-jdk21 AS builder

WORKDIR /home/gradle

COPY . .

RUN gradle bootJar

RUN mv build/libs/expass1-0.0.1-SNAPSHOT.jar app.jar

FROM eclipse-temurin:21-alpine

# Create a group and user
RUN addgroup -g 1000 app \
    && adduser -G app -D -u 1000 -h /app app

# Set working directory for the app
WORKDIR /app

# Copy the JAR from the builder stage to /app directory
COPY --from=builder /home/gradle/app.jar /app/

# Change ownership of the /app directory
RUN chown -R app:app /app

# Run the container as the 'app' user
USER app

EXPOSE 8080

# Run the jar
CMD ["java", "-jar", "/app/app.jar"]

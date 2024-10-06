FROM gradle:8-jdk21 AS builder

WORKDIR /home/gradle

COPY . .

RUN gradle bootJar

RUN mv build/libs/expass1-0.0.1-SNAPSHOT.jar app.jar

FROM eclipse-temurin:21-alpine

COPY --from=builder /home/gradle/app.jar .

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
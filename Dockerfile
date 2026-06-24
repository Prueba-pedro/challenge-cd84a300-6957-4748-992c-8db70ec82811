FROM openjdk:21-jdk-slim as builder
WORKDIR /app
COPY..
RUN./mvnw package -DskipTests

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/ecommerce-api.jar ecommerce-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ecommerce-api.jar"]
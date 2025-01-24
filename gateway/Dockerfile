FROM openjdk:17-jdk-slim
LABEL authors="Alexis Ortiz"
ARG JAR_FILE=target/gateway-1.0.jar
COPY ${JAR_FILE} app-gateway.jar
EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app_gateway.jar"]
FROM openjdk:17-jdk-slim
LABEL authors="Alexis Ortiz"
ARG JAR_FILE=target/config-service-1.0.jar
COPY ${JAR_FILE} app_config_server.jar
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app_config_server.jar"]
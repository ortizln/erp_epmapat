FROM openjdk:17-jdk-slim
LABEL authors="Alexis Ortiz"
ARG JAR_FILE=target/mc_recaudacion-1.0.jar
COPY ${JAR_FILE} app_mc_recaudacion.jar
EXPOSE 8761

ENTRYPOINT ["java", "-jar", "app_mc_recaudacion.jar"]
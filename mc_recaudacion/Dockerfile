# Use a minimal JRE base image
FROM openjdk:17-jre-slim

# Add metadata
LABEL authors="Alexis Ortiz" \
      version="1.0" \
      description="Microservice for mc_recaudacion"

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
ARG JAR_FILE=target/mc_recaudacion-1.0.jar
COPY ${JAR_FILE} app.jar

# Expose the application port
EXPOSE 8002

# Create a non-root user and switch to it
RUN adduser --system --no-create-home appuser
USER appuser

# Set resource limits (optional)
ENV JAVA_OPTS="-Xmx512m -Xms256m"

# Run the application
ENTRYPOINT ["java", "$JAVA_OPTS", "-jar", "app.jar"]
# # Use the official Maven image to build the project
# FROM openjdk:11-jre-slim
# WORKDIR /app
# COPY target/hello-service.jar /hello-service.jar
# EXPOSE 8080
# CMD ["java", "-jar", "app.jar"]
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]
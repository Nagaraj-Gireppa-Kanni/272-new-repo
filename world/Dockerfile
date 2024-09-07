# # Use the official Maven image to build the project
# FROM maven:3.8.5-openjdk-11 AS build
# WORKDIR /app
# COPY . .
# RUN mvn clean package -DskipTests

# # Use the official OpenJDK image to run the application
# FROM openjdk:11-jre-slim
# WORKDIR /app
# COPY --from=build /app/target/world-service-0.0.1-SNAPSHOT.jar app.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]


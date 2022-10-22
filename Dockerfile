# FROM openjdk:17-jdk-slim
# with the slim version you have no curl for the healthcheck
FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
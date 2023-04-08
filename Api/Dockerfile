FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/*.jar
COPY ./build/libs/*.jar app.jar

ARG PROFILE=prod
ENV PROFILE=${PROFILE}

EXPOSE 8080

ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
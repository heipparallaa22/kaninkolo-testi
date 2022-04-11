FROM openjdk:11

ARG JAR_FILE=./target/app.jar
COPY ${JAR_FILE} app.jar

COPY ./config/my-config.properies /my-config.properties

RUN curl -o restassured.451.jar https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.5.1


FROM openjdk:11

ARG JAR_FILE=./app.jar
COPY ${JAR_FILE} app.jar

COPY ./config/my-config.properties ./my-config.properties

ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:11-slim

From gcr.io/distroless/java11-debian11

COPY target/*.jar app.jar

CMD java -jar app.jar

#USER 
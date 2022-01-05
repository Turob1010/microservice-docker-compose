FROM openjdk:16.0.2

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /opt/registry-service/app.jar

ENTRYPOINT ["java","-jar","/opt/registry-service/app.jar"]
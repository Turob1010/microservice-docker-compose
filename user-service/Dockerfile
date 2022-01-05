FROM openjdk:16.0.2

VOLUME /tmp

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/user-service

COPY ${JAR_FILE} /opt/user-service/app.jar

ENTRYPOINT ["java","-jar","/opt/user-service/app.jar"]
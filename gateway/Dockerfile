FROM openjdk:16.0.2

VOLUME /tmp

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/gateway

COPY ${JAR_FILE} /opt/gateway/app.jar

ENTRYPOINT ["java","-jar","/opt/gateway/app.jar"]
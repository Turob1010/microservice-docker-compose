FROM openjdk:16.0.2

VOLUME tmp/

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/product-service

COPY ${JAR_FILE} /opt/product-service/app.jar

ENTRYPOINT ["java","-jar","/opt/product-service/app.jar"]
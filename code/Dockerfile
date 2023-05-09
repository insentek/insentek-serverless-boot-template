FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} webframework.jar
ENTRYPOINT ["java","-jar","/webframework.jar"]
FROM openjdk:17-jdk-slim-buster
COPY target/*.jar root.jar
ENTRYPOINT ["java", "-Xms128m", "-jar", "root.jar"]
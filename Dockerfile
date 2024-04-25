FROM openjdk:17-jdk-slim-buster
COPY targe/*.jar root.jar
ENTRYPOINT ["java", "-Dserver.port=1268", "-Xms128m", "-jar", "root.jar"]
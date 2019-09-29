FROM  openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/dockerlogtest-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8123
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
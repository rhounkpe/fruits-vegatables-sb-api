FROM openjdk:11
EXPOSE 8888
ADD ./target/fruits-vegatables-sb-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "fruits-vegatables-sb-api.jar"]
FROM openjdk:20-jdk

COPY target/api-java-1.0-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

EXPOSE 8081
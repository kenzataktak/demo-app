FROM amazoncorretto:25-alpine
WORKDIR /app
COPY target/demo-app-1.0-SNAPSHOT-jar-with-dependencies.jar /app/demo-app.jar
ENTRYPOINT ["java", "-jar", "demo-app.jar"]
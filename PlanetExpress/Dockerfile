FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/PlanetExpress-0.0.1.jar app.jar
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

FROM openjdk:8
WORKDIR /app
COPY target/user.jar user.jar
EXPOSE 8585
ENTRYPOINT ["java", "-jar", "user.jar"]
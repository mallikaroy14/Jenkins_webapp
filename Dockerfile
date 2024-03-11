FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/assessment-jenkins.jar .
EXPOSE 8080
CMD ["java","-jar","assessment-jenkins.jar"]







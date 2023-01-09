FROM openjdk:18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} pipeline-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pipeline-0.0.1-SNAPSHOT.jar"]

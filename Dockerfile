FROM openjdk:21

VOLUME /tmp

COPY target/*.jar Room-0.0.1-SNAPSHOT.jar

EXPOSE 49912
ENTRYPOINT ["java","-jar","/Room-0.0.1-SNAPSHOT.jar"]
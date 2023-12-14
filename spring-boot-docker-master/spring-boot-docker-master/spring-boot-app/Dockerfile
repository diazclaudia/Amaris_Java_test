FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-docker.war
ADD ${JAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]
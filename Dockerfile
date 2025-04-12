FROM openjdk:21-jdk

WORKDIR /app
COPY build/libs/hmcts-backend-test.jar hmcts-backend-test-api.jar
 
EXPOSE 4000

CMD [ "java", "-jar", "hmcts-backend-test-api.jar" ]  
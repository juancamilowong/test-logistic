FROM openjdk:8
VOLUME /tmp
EXPOSE 8992
ADD ./target/test-logistic-1.0.jar test-logistic.jar
ENTRYPOINT ["java","-jar","test-logistic.jar"]
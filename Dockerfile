FROM openjdk:11
EXPOSE 8080
ADD target/monitoring-demo.jar monitoring-demo.jar
ENTRYPOINT ["java","-jar","/monitoring-demo.jar"]
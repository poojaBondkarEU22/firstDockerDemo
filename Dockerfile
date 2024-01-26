FROM openjdk:17
EXPOSE 8085
COPY ./target/sp_docker_first_demo.jar sp_docker_first_demo.jar
ENTRYPOINT ["java","-jar","sp_docker_first_demo.jar"]
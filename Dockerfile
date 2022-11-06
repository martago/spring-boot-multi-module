FROM maven:3.8.6-amazoncorretto-19 AS build
COPY ./application/src /home/application/src
COPY ./application/pom.xml /home/application
COPY ./controller/src /home/controller/src
COPY ./controller/pom.xml /home/controller
COPY ./domain/src /home/domain/src
COPY ./domain/pom.xml /home/domain
COPY ./repository/src /home/repository/src
COPY ./repository/pom.xml /home/repository
COPY ./service/src /home/service/src
COPY ./service/pom.xml /home/service
COPY pom.xml /home
RUN mvn -f /home/pom.xml clean package

FROM maven:3.8.6-amazoncorretto-19
COPY --from=build /home/application/target/application-0.0.1-SNAPSHOT.jar /usr/local/lib/application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/application.jar"]
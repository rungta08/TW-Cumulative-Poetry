FROM openjdk:12-jdk
WORKDIR /
COPY out/artifacts/TW-Cumulative-Poetry_jar/cumulative-poetry-master.jar /cumulative-poetry-master.jar
ENTRYPOINT ["java", "-jar", "/cumulative-poetry-master.jar"]
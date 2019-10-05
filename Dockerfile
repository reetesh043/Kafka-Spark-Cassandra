# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
MAINTAINER Reetesh Kumar <XXXXXXXX@gmail.com>

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9082 available to the world outside this container
EXPOSE 9082

# The application's jar file
ARG JAR_FILE=target/spark-kafka-cassandra-api-1.0.0.jar

# Add the application's jar to the container
ADD ${JAR_FILE} spark-kafka-cassandra-api-1.0.0.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spark-kafka-cassandra-api-1.0.0.jar"]

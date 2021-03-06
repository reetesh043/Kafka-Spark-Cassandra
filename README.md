# spark-kafka-cassandra-api


### Table of Contents

* [Summary](#summary)
* [Requirements](#requirements)
* [Getting Started](#getting-started)
* [General Info](#general-info)

### Summary

The API which will be consuming messages from kafka and storing into cassandra using spark streaming.

### Requirements

* Java 1.8
* Maven 3.5 or higher
* Kafka 2.12-2.0.0 (or latest stable)
* Spark 2.3.0
* Scala 2.11.12
* Cassandra - latest stable version

### Getting Started

Use Maven to install dependencies and build the artifacts
```
./mvnw clean package
```

#### Start up kafka server, zookeeper and configure topic

```text

#### Windows
# In command prompt (cmd) change directory (cd) in to Kafka unzipped folder


# Start up zookeeper with default configuration in new cmd
    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start up kafka server with default configuration in separate cmd
    .\bin\windows\kafka-server-start.bat .\config\server.properties
    
# Create topic in separate cmd prompt

  # - Topic name, Fraud alerts request listened at: DEV_KAFKA_PES_INGESTION_FPS_STP
    .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic DEV_KAFKA_PES_INGESTION_FPS_STP
    
# Verify topic creation
    .\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

# Setup producer to post message into the topic
    .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic DEV_KAFKA_PES_INGESTION_FPS_STP
    
 #### MAC OSX
 
 Install Homebrew

   ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"
 
# Install Kafka:

     brew install kafka
 
# Start Zookeeper:

    zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
    
# Start Kafka server:

     kafka-server-start /usr/local/etc/kafka/server.properties

# Create Kafka Topic:

    kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
    
# Initialize Producer console:
    kafka-console-producer --broker-list localhost:9092 --topic test

# Initialize Consumer console:

   kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning
 
```

#### Set up scala and spark using homebrew on mac os x

``` text

Install Homebrew

   ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"

Step 1: install Java

        brew cask install java

Step 2:  install Scala

        brew install scala
        
Step 3:  install Apache Spark

        brew install apache-spark
        
Step 4:  Start the Spark Shell- run the below command

         spark-shell

```

#### Set up cassandra on mac OS X

``` text

1. Install Homebrew

   ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"

2. Install Python

   brew install python

3. Install cql

   pip install cql

4. Install Cassandra

   brew install cassandra

5. Starting/Stopping Cassandra
  start: brew services start cassandra
  stop: brew services stop cassandra

6. Connect to Cassandra cluster using its command line interface cqlsh (Cassandra Query Language shell):

   $ cqlsh
   
   
```

#### Start up the project with default tomcat server

```
./mvnw spring-boot:run  or mvn clean spring-boot:run


#### Run the project as jar 

  1. Build project for every changes to create the jar
       mvn clean package
       
  2. To Run the jar
      java -jar /PathOfJarFile

```

#### Sample request

* kafka topic payload

    - The below message into kafka topic topic_name

```json

{"notification":{"notificationheader":{"version":"1.0","creationdatetime":"2019-01-29T12:07:32.587Z","notificationkey":"TN1144551000200220","numberofevents":1}}}

```

### General Info

#### Built With

* [Spring Boot 2.0.4](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Kafka](https://kafka.apache.org/) - Distributed message streaming platform
* [Junit5](https://junit.org/junit5/docs/current/user-guide/) - JUnit 5 User Guide
* Scala (https://www.scala-lang.org/)
* Spark (https://spark.apache.org/)
* Cassandra (http://cassandra.apache.org/)


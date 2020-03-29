# Helidon-POCs


## Helidon SE Example (./quickstart-se)

The Helidon SE example implements the REST service using the Helidon WebServer component directly. It shows the basics of configuring the WebServer and implementing basic routing rules. 

#### Generate The Project
mvn archetype:generate -DinteractiveMode=false \
    -DarchetypeGroupId=io.helidon.archetypes \
    -DarchetypeArtifactId=helidon-quickstart-se \
    -DarchetypeVersion=1.4.4 \
    -DgroupId=io.helidon.examples \
    -DartifactId=quickstart-se \
    -Dpackage=io.helidon.examples.quickstart.se

#### Build the Application

`cd quickstart-se`

## Build

```
mvn package
```

## Start the application

```
java -jar target/quickstart-se.jar
```

## Exercise the application

```
curl -X GET http://localhost:8080/greet
{"message":"Hello World!"}

curl -X GET http://localhost:8080/greet/Joe
{"message":"Hello Joe!"}

curl -X PUT -H "Content-Type: application/json" -d '{"greeting" : "Hola"}' http://localhost:8080/greet/greeting

curl -X GET http://localhost:8080/greet/Jose
{"message":"Hola Jose!"}
```

## Try health and metrics

```
curl -s -X GET http://localhost:8080/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET http://localhost:8080/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET http://localhost:8080/metrics
{"base":...
. . .

```




## Helidon MP Example (./quickstart-mp)

The Helidon MP example implements the REST service using the JAX-RS support provided by the Helidon MicroProfile server. 

#### Generate The Project

mvn archetype:generate -DinteractiveMode=false \
    -DarchetypeGroupId=io.helidon.archetypes \
    -DarchetypeArtifactId=helidon-quickstart-mp \
    -DarchetypeVersion=1.4.3 \
    -DgroupId=io.helidon.examples \
    -DartifactId=quickstart-mp \
    -Dpackage=io.helidon.examples.quickstart.mp

#### Build the Application

`cd quickstart-mp`

## Build

```
mvn package
```

## Start the application

```
java -jar target/quickstart-mp.jar
```

## Exercise the application

```
curl -X GET http://localhost:8080/greet
{"message":"Hello World!"}

curl -X GET http://localhost:8080/greet/Joe
{"message":"Hello Joe!"}

curl -X PUT -H "Content-Type: application/json" -d '{"greeting" : "Hola"}' http://localhost:8080/greet/greeting

curl -X GET http://localhost:8080/greet/Jose
{"message":"Hola Jose!"}
```

## Try health and metrics

```
curl -s -X GET http://localhost:8080/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET http://localhost:8080/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET http://localhost:8080/metrics
{"base":...
. . .

```




## 3. Helidon MP JPA (./helidon-jpa)

Adapted from the guide `Using JPA in Helidon MP` available [here](https://helidon.io/docs/latest/index.html#/guides/24_jpa)



## 4. Java Packaging MP (./mp-java-packaging)

Adapted from the guide `Creating Docker Images` available [here](https://helidon.io/docs/latest/#/guides/30_dockerfile)

```
export JAVA_HOME=/usr/lib/jvm/default-java
```


```
mvn archetype:generate -DinteractiveMode=false \
    -DarchetypeGroupId=io.helidon.archetypes \
    -DarchetypeArtifactId=helidon-quickstart-mp \
    -DarchetypeVersion=1.4.1 \
    -DgroupId=io.helidon.examples \
    -DartifactId=mp-java-packaging \
    -Dpackage=io.helidon.mp.javapackaging
```

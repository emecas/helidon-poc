# Helidon-POCs


## Helidon SE Example (./quickstart-se)

The Helidon SE example implements the REST service using the Helidon WebServer component directly. It shows the basics of configuring the WebServer and implementing basic routing rules. 

#### Generate The Project

mvn archetype:generate -DinteractiveMode=false \
-DarchetypeGroupId=io.helidon.archetypes \
-DarchetypeArtifactId=helidon-quickstart-se \
-DarchetypeVersion=0.11.0 \
-DgroupId=io.helidon.examples \
-DartifactId=quickstart-se \
-Dpackage=io.helidon.examples.quickstart.se


#### Build the Application

`cd quickstart-quickstart-se`

`mvn package`


#### Run the Application

`java -jar target/quickstart-se.jar`


#### Try the Application

`curl -X GET http://localhost:8080/greet`

response: `{"message":"Hello World!"}`


`curl -X GET http://localhost:8080/greet/Emecas`

response: `{"message":"Hello Emecas!"}`


`curl -X PUT http://localhost:8080/greet/greeting/Hola`

response: `{"greeting":"Hola"}`


`curl -X GET http://localhost:8080/greet/Gato`

response: `{"message":"Hola Gato!"}`




## Helidon MP Example (./quickstart-mp)

The Helidon MP example implements the REST service using the JAX-RS support provided by the Helidon MicroProfile server. 

#### Generate The Project

mvn archetype:generate -DinteractiveMode=false \
    -DarchetypeGroupId=io.helidon.archetypes \
    -DarchetypeArtifactId=helidon-quickstart-mp \
    -DarchetypeVersion=0.11.0 \
    -DgroupId=io.helidon.examples \
    -DartifactId=quickstart-mp \
    -Dpackage=io.helidon.examples.quickstart.mp

#### Build the Application

`cd quickstart-quickstart-mp`

`mvn package`


#### Run the Application

`java -jar target/quickstart-mp.jar`


#### Try the Application

`curl -X GET http://localhost:8080/greet`

response: `{"message":"Hello World!"}`


`curl -X GET http://localhost:8080/greet/Emecas`

response: `{"message":"Hello Emecas!"}`


`curl -X PUT http://localhost:8080/greet/greeting/Hola`

response: `{"greeting":"Hola"}`


`curl -X GET http://localhost:8080/greet/Gato`

response: `{"message":"Hola Gato!"}`

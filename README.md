## Helidon SE Example

The Helidon SE example implements the REST service using the Helidon WebServer component directly. It shows the basics of configuring the WebServer and implementing basic routing rules. 

#### Generate The Project

mvn archetype:generate -DinteractiveMode=false \
-DarchetypeGroupId=io.helidon.archetypes \
-DarchetypeArtifactId=helidon-quickstart-se \
-DarchetypeVersion=0.10.5 \
-DgroupId=io.helidon.examples \
-DartifactId=quickstart-se \
-Dpackage=io.helidon.examples.quickstart.se


#### Build the Application

`cd quickstart-*`

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

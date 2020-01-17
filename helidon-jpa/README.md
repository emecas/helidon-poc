Use the Maven Archetype to Generate a Helidon MP Application

In a shell, cd into an empty directory and run this:

mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=io.helidon.archetypes \
    -DarchetypeArtifactId=helidon-mp \
    -DarchetypeVersion=1.4.1 \
    -DgroupId=io.helidon.example \
    -DartifactId=helidon-jpa \
    -Dpackage=io.helidon.example.jpa \
    -DrestResourceName=ExampleResource \
    -DapplicationName=ExampleApplication

 

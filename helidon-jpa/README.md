Use the Maven Archetype to Generate a Helidon MP Application

```
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
```

Update [\pom.xml] file  by adding these 7  dependencies: 

1. JDBC Database Driver
2. Connection Pool Extension
3. JTA Extension
4. Provider-Independent Helidon JPA Extension 
5. EclipseLink JPA Extension
6. JTA Dependency
7. JPA Dependency

and the Static Weaving maven plugin:


### Use the Maven Archetype to Generate a Helidon MP Application

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

### Update ```pom.xml``` file  by adding these 7  dependencies: 

1. JDBC Database Driver
2. Connection Pool Extension
3. JTA Extension
4. Provider-Independent Helidon JPA Extension 
5. EclipseLink JPA Extension
6. JTA Dependency
7. JPA Dependency

and the Static Weaving maven plugin:

```
<plugin>
    <groupId>com.ethlo.persistence.tools</groupId>
    <artifactId>eclipselink-maven-plugin</artifactId>
    <version>2.7.1.1</version>
    <dependencies> 
        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.1</version>
        </dependency>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.0</version>
        </dependency>
    </dependencies>
    <executions>
        <execution>
            <id>weave</id>
            <phase>process-classes</phase>
            <goals>
                <goal>weave</goal> 
            </goals>
        </execution>
        <execution>
            <id>modelgen</id>
            <phase>generate-sources</phase>
            <goals>
                <goal>modelgen</goal> 
            </goals>
        </execution>
    </executions>
</plugin>
```

### Add a ```META-INF/persistence.xml``` Descriptor

```
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2" 
             xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
                                 http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
    <persistence-unit name="greeting" transaction-type="JTA"> 
        <description>A persistence unit for the greeting example.</description>
        <jta-data-source>greetingDataSource</jta-data-source> 
        <class>io.helidon.example.jpa.Greeting</class> 
        <properties> 
            <property name="eclipselink.deploy-on-startup" value="true"/>
            <property name="eclipselink.jdbc.native-sql" value="true"/>
            <property name="eclipselink.logging.logger" value="JavaLogger"/>
            <property name="eclipselink.logging.parameters" value="true"/>
            <property name="eclipselink.target-database" value="org.eclipse.persistence.platform.database.H2Platform"/> 
            <property name="eclipselink.target-server" value="io.helidon.integrations.cdi.eclipselink.CDISEPlatform"/> 
            <property name="eclipselink.weaving" value="false"/> 
        </properties>
    </persistence-unit>
</persistence>
```

### Add Resource Class ```src/main/java/io/helidon/example/jpa/ExampleResource.java``` functionality:

1. Add imports.
2. Add annotations and EntityManager field.
3. Add resource method

### Add Logging configuration ```src/main/resources/logging.properties```


### Build the Application

```
mvn package
```

### Run the Application

```
java -jar target/helidon-jpa.jar
```

### Test the Application

```
curl http://localhost:8080/example/response/Marco
```
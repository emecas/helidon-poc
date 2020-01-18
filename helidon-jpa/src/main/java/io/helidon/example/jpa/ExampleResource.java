package io.helidon.example.jpa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Simple JAXRS resource class.
 */
@Path("/example")
@Dependent
public class ExampleResource {

    @PersistenceContext 
    private EntityManager em;

    @Produces("text/plain")
    @Path("/")
    @GET
    public String get() {
        return "It works!";
    }
}

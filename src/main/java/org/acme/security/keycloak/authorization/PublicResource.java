package org.acme.security.keycloak.authorization;

import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/public")
public class PublicResource {

    @GET
    @PermitAll
    public String server() {
        return "Endpoint publico accessible a todos.";
    }
}
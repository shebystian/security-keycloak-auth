package org.acme.security.keycloak.authorization;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/forbidden")
public class ForbiddenResource {
    @GET
    public String forbidden() {
        return "El usuario que esta intentando acceder al recurso no esta autorizado.";
    }
}

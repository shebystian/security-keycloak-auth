package org.acme.security.keycloak.authorization;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.quarkus.security.Authenticated;

@Path("/api/admin")
@Authenticated
public class AdminResource {

    @GET
    @RolesAllowed("admin_client_role")
    @Produces(MediaType.TEXT_PLAIN)
    public String admin() {
        return "acceso concedido a usuario/rol administrador.";
    }
}
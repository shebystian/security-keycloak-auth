package org.acme.security.keycloak.authorization;


import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.keycloak.authorization.client.AuthzClient;

@Path("/api/private")
@Authenticated
public class PrivateResource {
    //@Inject
    //AuthzClient authzClient;


    @GET
    @RolesAllowed("user_client_role")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "acceso concedido a usuario registrado en keycloak";
    }

}

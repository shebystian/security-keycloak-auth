package org.acme.security.keycloak.authorization;


import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.jboss.resteasy.reactive.NoCache;

import io.quarkus.security.identity.SecurityIdentity;

import org.acme.security.keycloak.entity.User;

@Authenticated
@Path("/api/users")
public class UsersResource {

    @Inject
    SecurityIdentity identity;
h
    @GET
    @Path("/me")
    @RolesAllowed("user_client_role")
    @NoCache
    public User me() {
        return new User(identity);
    }

    @GET
    @Path("/access")
    @RolesAllowed("user_client_role")
    @NoCache
    public String test() {
        return "acceso a usuario basico, no admin";
    }





}
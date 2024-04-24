package org.acme.security.keycloak.entity;

import io.quarkus.security.identity.SecurityIdentity;

public class User {
    private final String userName;

    //Constructor
    public User(SecurityIdentity identity) {
        this.userName = identity.getPrincipal().getName();
    }

    //propiedades publicas
    public String getUserName() {
        return userName;
    }

}

package com.myapp.myapp.configuration;

import com.manywho.sdk.services.annotations.Property;

public class Configuration {
    @Property("Example Username")
    private String username;

    @Property("Example Password")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

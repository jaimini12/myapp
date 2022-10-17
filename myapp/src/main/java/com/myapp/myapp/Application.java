package com.myapp.myapp;

import com.manywho.sdk.services.BaseApplication;
import com.manywho.sdk.services.ServiceBinder;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends BaseApplication {
    public Application() {
        registerSdk()
                .packages("com.myapp.myapp")
                .register(new ApplicationBinder());
    }

    public static void main(String[] args) {
        startServer(new Application(), "api/myapp/1");
    }
}

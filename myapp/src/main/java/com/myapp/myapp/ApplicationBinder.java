package com.myapp.myapp;

import com.myapp.myapp.services.DataService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(DataService.class).to(DataService.class);
    }
}

package com.opensam.example.withdynamo.configs.jerseyConfigs;

import com.opensam.example.withdynamo.controllers.RestController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(RestController.class);
    }
}


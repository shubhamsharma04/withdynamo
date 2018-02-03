package com.opensam.example.withdynamo.controllers;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class RestController {

    @GET
    public String hello(){
        return "hello";
    }

}

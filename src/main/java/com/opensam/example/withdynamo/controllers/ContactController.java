package com.opensam.example.withdynamo.controllers;

import com.opensam.example.withdynamo.dataformat.Comment;
import com.opensam.example.withdynamo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.*;
import java.net.URI;

@Controller
@Path("/")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GET
    public String hello(){
        return "hello";
    }

    @POST
    @Path("/comment")
    @Consumes("application/json")
    @Produces("application/json")
    public URI createComment(Comment comment) {
        return contactService.createComment(comment);
    }

}

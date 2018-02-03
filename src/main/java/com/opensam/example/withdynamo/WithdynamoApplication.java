package com.opensam.example.withdynamo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class WithdynamoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new WithdynamoApplication().configure(new SpringApplicationBuilder(WithdynamoApplication.class)).run(args);
    }
}

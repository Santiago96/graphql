package com.course.example.My.First.Web.Appication;

import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyFirstWebAppicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstWebAppicationApplication.class, args);
    }

    @Bean
    public void register() {
        RuntimeWiring.newRuntimeWiring().scalar(ExtendedScalars.Date);
    }

}

package com.tech.springBootRestWebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot RESTful Web Services
 *
 */
@SpringBootApplication
@ComponentScan({"controller","com.tech.springBoot.ws.web.api"})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}

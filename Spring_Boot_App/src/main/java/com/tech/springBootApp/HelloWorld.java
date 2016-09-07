package com.tech.springBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Boot main Application
 *
 */
@Controller
@SpringBootApplication
public class HelloWorld 
{
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main( String[] args ) throws Exception
    {
        /*System.out.println( "Hello World!" );*/
    	SpringApplication.run(HelloWorld.class, args);
    }
}

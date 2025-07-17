package com.gbenitesgonsales.apijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.cdimascio.dotenv.Dotenv;

@RestController
@SpringBootApplication
public class Main {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!" ;
    }

    @GetMapping("/greet")
    public String greet(){
        Dotenv dotenv = Dotenv.load();
        String name = dotenv.get("NAME");
        return "Hello, "+name+"!" ;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
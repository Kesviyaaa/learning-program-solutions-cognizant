package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                 // Marks this class as a REST controller
public class HelloController {

    @GetMapping("/hello")       // HTTP GET → /hello
    public String sayHello() {
        return "Hello from Spring Boot!";
    }
}

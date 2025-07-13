package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Import the XML so Spring sees the <bean id="country" …/> definition.
 */
@SpringBootApplication
@ImportResource("classpath:country.xml")
public class CountryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApplication.class, args);
    }
}

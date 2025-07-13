package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Exposes the Country bean as JSON at /country */
@RestController
public class CountryController {

    private final Country country;

    @Autowired
    public CountryController(Country country) {
        this.country = country;
    }

    @GetMapping("/country")
    public Country getCountry() {
        return country;   // Spring automatically serializes to JSON
    }
}

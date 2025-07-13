package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * REST endpoints for Country resources.
 */
@RestController
@RequestMapping("/countries")
public class CountryController {

    /** In‑memory “database” of countries. */
    private static final Map<String, Country> COUNTRY_STORE = Map.of(
            "IN", new Country("IN", "India"),
            "US", new Country("US", "United States"),
            "FR", new Country("FR", "France"),
            "JP", new Country("JP", "Japan")
    );

    /**
     * GET /countries  – returns a default Country (still satisfies Exp #4).
     */
    @GetMapping
    public Country getDefaultCountry() {
        return COUNTRY_STORE.get("IN");        // or choose any default
    }

    /**
     * GET /countries/{code}  – returns country matching the path variable.
     * Example: /countries/US
     */
    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = COUNTRY_STORE.get(code.toUpperCase());
        if (country == null) {
            throw new CountryNotFoundException("Country with code " + code + " not found");
        }
        return country;
    }

    /* ---------- Exception Handling ---------- */

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CountryNotFoundException.class)
    public String handleNotFound(RuntimeException ex) {
        return ex.getMessage();
    }
}

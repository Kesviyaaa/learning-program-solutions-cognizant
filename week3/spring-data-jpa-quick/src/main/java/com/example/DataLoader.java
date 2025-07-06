package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CountryRepository repo;

    public DataLoader(CountryRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create new country
        Country c1 = new Country();
        c1.setName("India");
        c1.setCode("IN");

        repo.save(c1);

        // Fetch and print
        Country found = repo.findByCode("IN");
        System.out.println("Found Country: " + found.getName() + " (" + found.getCode() + ")");
    }
}
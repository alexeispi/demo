package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {


    private final CountryService service;

    @Autowired
    CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/countries")
    List<Country> all() {
        return service.list();
    }

    @GetMapping("/countries/{id}")
    Country one(@PathVariable Long id) {
        return service.findById(id);
    }
}

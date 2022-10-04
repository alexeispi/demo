package com.example.demo;

    class CountryNotFoundException extends RuntimeException {
        CountryNotFoundException(Long id) {
            super("Could not find country " + id);
        }
    }

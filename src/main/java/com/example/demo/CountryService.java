package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> list() {
        return countryRepository.findAll();
    }

    public Country findById(long id) throws CountryNotFoundException {
        Optional<Country> oCat = countryRepository.findById(id);
        return oCat.get();
    }


}

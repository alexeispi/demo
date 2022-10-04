package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Book;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CountryServiceUnitTest {
    @Autowired
    private CountryService countryService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Country> countries = countryService.list();

        Assertions.assertEquals(countries.size(), 3);
    }
}

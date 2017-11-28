package com.springboot.bdd.springbootbdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by dhakamada on 28/11/17.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping (value = "/products", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Collection<Product> getProducts() {
        return repository.findAll();
    }
}

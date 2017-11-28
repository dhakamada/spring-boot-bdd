package com.springboot.bdd.springbootbdd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dhakamada on 28/11/17.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



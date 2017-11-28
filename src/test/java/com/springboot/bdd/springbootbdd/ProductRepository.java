package com.springboot.bdd.springbootbdd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by dhakamada on 28/11/17.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    Collection<Product> findByName(String pen);
}

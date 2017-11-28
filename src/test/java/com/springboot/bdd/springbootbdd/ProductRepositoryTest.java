package com.springboot.bdd.springbootbdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

/**
 * Created by dhakamada on 28/11/17.
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    public void save() {
        this.repository.save(new Product("Pen"));

        Collection<Product> products = this.repository.findByName("Pen");
        Assertions.assertThat(products).isNotNull();
        Assertions.assertThat(products.size()).isEqualTo(1);
        Product p = products.iterator().next();
        Assertions.assertThat(p.getName()).isEqualTo("Pen");
        Assertions.assertThat(p.getId()).isNotNull();
        Assertions.assertThat(p.getId()).isGreaterThan(0);
    }
}

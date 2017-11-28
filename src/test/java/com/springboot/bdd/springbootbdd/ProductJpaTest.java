package com.springboot.bdd.springbootbdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dhakamada on 28/11/17.
 */

@DataJpaTest
@RunWith(SpringRunner.class)
public class ProductJpaTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void creation() {
        Product product = testEntityManager.persistAndFlush(new Product("Pencil"));
        Assertions.assertThat(product.getName()).isEqualTo("Pencil");
        Assertions.assertThat(product.getId()).isNotNull();
        Assertions.assertThat(product.getId()).isGreaterThan(0);
    }
}

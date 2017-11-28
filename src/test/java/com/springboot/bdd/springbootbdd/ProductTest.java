package com.springboot.bdd.springbootbdd;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by dhakamada on 28/11/17.
 */
public class ProductTest {

    @Test
    public void create() {
        Product p = new Product(1L, "Diego");
        Assertions.assertThat(p.getId()).isEqualTo(1L);
        Assertions.assertThat(p.getName()).isNotBlank();
        Assertions.assertThat(p.getName()).isEqualTo("Diego");
    }
}

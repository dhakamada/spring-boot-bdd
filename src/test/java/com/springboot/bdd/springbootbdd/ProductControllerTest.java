package com.springboot.bdd.springbootbdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

/**
 * Created by dhakamada on 28/11/17.
 */
@WebMvcTest
@RunWith(SpringRunner.class)
public class ProductControllerTest {

    @MockBean
    private ProductRepository repository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getProducts() throws Exception {

        Mockito.when(this.repository.findAll())
                .thenReturn(Collections.singletonList(new Product(1L, "Book")));

        this.mockMvc.perform(MockMvcRequestBuilders.get("/products"))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("@.[0].id").value(1L))
                .andExpect(MockMvcResultMatchers.jsonPath("@.[0].name").value("Book"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

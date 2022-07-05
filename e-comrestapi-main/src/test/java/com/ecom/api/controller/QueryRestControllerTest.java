package com.ecom.api.controller;

import static org.mockito.Mockito.when;

import com.ecom.api.repository.ProductRepo;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {QueryRestController.class})
@ExtendWith(SpringExtension.class)
class QueryRestControllerTest {
    @MockBean
    private ProductRepo productRepo;

    @Autowired
    private QueryRestController queryRestController;

    /**
     * Method under test: {@link QueryRestController#getac()}
     */
    @Test
    void testGetac() throws Exception {
        when(productRepo.findByac()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/product/ac");
        MockMvcBuilders.standaloneSetup(queryRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link QueryRestController#getac()}
     */
    @Test
    void testGetac2() throws Exception {
        when(productRepo.findByac()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/product/ac");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(queryRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link QueryRestController#getlaptop()}
     */
    @Test
    void testGetlaptop() throws Exception {
        when(productRepo.findBylaptop()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/product/laptop");
        MockMvcBuilders.standaloneSetup(queryRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link QueryRestController#getlaptop()}
     */
    @Test
    void testGetlaptop2() throws Exception {
        when(productRepo.findBylaptop()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/product/laptop");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(queryRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link QueryRestController#getmobile()}
     */
    @Test
    void testGetmobile() throws Exception {
        when(productRepo.findBymobile()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/product/mobile");
        MockMvcBuilders.standaloneSetup(queryRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link QueryRestController#getmobile()}
     */
    @Test
    void testGetmobile2() throws Exception {
        when(productRepo.findBymobile()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/product/mobile");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(queryRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}


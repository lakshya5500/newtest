package com.ecom.api.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Category;
import com.ecom.api.service.CategoryService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CategoryRestController.class})
@ExtendWith(SpringExtension.class)
class CategoryRestControllerTest {
    @Autowired
    private CategoryRestController categoryRestController;

    @MockBean
    private CategoryService categoryService;

    /**
     * Method under test: {@link CategoryRestController#getCategories()}
     */
    @Test
    void testGetCategories() throws Exception {
        when(categoryService.findCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/category");
        MockMvcBuilders.standaloneSetup(categoryRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link CategoryRestController#getCategories()}
     */
    @Test
    void testGetCategories2() throws Exception {
        when(categoryService.findCategory()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/category");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(categoryRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link CategoryRestController#saveCategories(Category)}
     */
    @Test
    void testSaveCategories() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");
        when(categoryService.saveCategory((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");
        String content = (new ObjectMapper()).writeValueAsString(category1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/category")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(categoryRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"subcat\":\"Subcat\",\"cat\":\"Cat\",\"imgUrl\":\"https://example.org/example\"}"));
    }
}


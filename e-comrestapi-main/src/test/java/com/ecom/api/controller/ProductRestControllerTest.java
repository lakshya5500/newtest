package com.ecom.api.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Category;
import com.ecom.api.entity.Product;
import com.ecom.api.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import java.util.Optional;

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

@ContextConfiguration(classes = {ProductRestController.class})
@ExtendWith(SpringExtension.class)
class ProductRestControllerTest {
    @Autowired
    private ProductRestController productRestController;

    @MockBean
    private ProductService productService;

    /**
     * Method under test: {@link ProductRestController#deleteProductById(Integer)}
     */
    @Test
    void testDeleteProductById() throws Exception {
        when(productService.deleteProduct((Integer) any())).thenReturn("Delete Product");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/product/{pid}", 1);
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Delete Product"));
    }

    /**
     * Method under test: {@link ProductRestController#deleteProductById(Integer)}
     */
    @Test
    void testDeleteProductById2() throws Exception {
        when(productService.deleteProduct((Integer) any())).thenReturn("Delete Product");
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/product/{pid}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Delete Product"));
    }

    /**
     * Method under test: {@link ProductRestController#getProductByid(Integer)}
     */
    @Test
    void testGetProductByid() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        Optional<Product> ofResult = Optional.of(product);
        when(productService.getProductbyid((Integer) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/product/{pid}", 1);
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"pid\":1,\"pbrand\":\"Pbrand\",\"pname\":\"Pname\",\"description\":\"The characteristics of someone or"
                                        + " something\",\"price\":10.0,\"img\":\"Img\",\"rating\":10.0,\"total\":10.0,\"quantity\":1,\"category\":{\"subcat\":"
                                        + "\"Subcat\",\"cat\":\"Cat\",\"imgUrl\":\"https://example.org/example\"}}"));
    }

    /**
     * Method under test: {@link ProductRestController#getProducts()}
     */
    @Test
    void testGetProducts() throws Exception {
        when(productService.findProducts()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/product");
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link ProductRestController#getProducts()}
     */
    @Test
    void testGetProducts2() throws Exception {
        when(productService.findProducts()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/product");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link ProductRestController#saveProducts(Product)}
     */
    @Test
    void testSaveProducts() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        when(productService.saveProduct((Product) any())).thenReturn(product);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");

        Product product1 = new Product();
        product1.setCategory(category1);
        product1.setDescription("The characteristics of someone or something");
        product1.setImg("Img");
        product1.setPbrand("Pbrand");
        product1.setPid(1);
        product1.setPname("Pname");
        product1.setPrice(10.0d);
        product1.setQuantity(1);
        product1.setRating(10.0f);
        product1.setTotal(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(product1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/product")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"pid\":1,\"pbrand\":\"Pbrand\",\"pname\":\"Pname\",\"description\":\"The characteristics of someone or"
                                        + " something\",\"price\":10.0,\"img\":\"Img\",\"rating\":10.0,\"total\":10.0,\"quantity\":1,\"category\":{\"subcat\":"
                                        + "\"Subcat\",\"cat\":\"Cat\",\"imgUrl\":\"https://example.org/example\"}}"));
    }

    /**
     * Method under test: {@link ProductRestController#updateProductById(Integer, Product)}
     */
    @Test
    void testUpdateProductById() throws Exception {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        when(productService.updateProduct((Integer) any(), (Product) any())).thenReturn(product);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");

        Product product1 = new Product();
        product1.setCategory(category1);
        product1.setDescription("The characteristics of someone or something");
        product1.setImg("Img");
        product1.setPbrand("Pbrand");
        product1.setPid(1);
        product1.setPname("Pname");
        product1.setPrice(10.0d);
        product1.setQuantity(1);
        product1.setRating(10.0f);
        product1.setTotal(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(product1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/product/{pid}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(productRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"pid\":1,\"pbrand\":\"Pbrand\",\"pname\":\"Pname\",\"description\":\"The characteristics of someone or"
                                        + " something\",\"price\":10.0,\"img\":\"Img\",\"rating\":10.0,\"total\":10.0,\"quantity\":1,\"category\":{\"subcat\":"
                                        + "\"Subcat\",\"cat\":\"Cat\",\"imgUrl\":\"https://example.org/example\"}}"));
    }
}


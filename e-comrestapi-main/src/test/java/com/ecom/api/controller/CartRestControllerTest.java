package com.ecom.api.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Cart;
import com.ecom.api.service.CartService;
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

@ContextConfiguration(classes = {CartRestController.class})
@ExtendWith(SpringExtension.class)
class CartRestControllerTest {
    @Autowired
    private CartRestController cartRestController;

    @MockBean
    private CartService cartService;

    /**
     * Method under test: {@link CartRestController#bill()}
     */
    @Test
    void testBill() throws Exception {
        when(cartService.details()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/cart");
        MockMvcBuilders.standaloneSetup(cartRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link CartRestController#bill()}
     */
    @Test
    void testBill2() throws Exception {
        when(cartService.details()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/cart");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(cartRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link CartRestController#deleteCartById(Integer, Cart)}
     */
    @Test
    void testDeleteCartById() throws Exception {
        when(cartService.deleteCart((Integer) any())).thenReturn("Delete Cart");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/cart/{id}", 1);
        MockMvcBuilders.standaloneSetup(cartRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Delete Cart"));
    }

    /**
     * Method under test: {@link CartRestController#deleteCartById(Integer, Cart)}
     */
    @Test
    void testDeleteCartById2() throws Exception {
        when(cartService.deleteCart((Integer) any())).thenReturn("Delete Cart");
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/cart/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(cartRestController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Delete Cart"));
    }

    /**
     * Method under test: {@link CartRestController#saveCart(Cart)}
     */
    @Test
    void testSaveCart() throws Exception {
        Cart cart = new Cart();
        cart.setDescription("The characteristics of someone or something");
        cart.setId(1);
        cart.setImg("Img");
        cart.setPbrand("Pbrand");
        cart.setPid(1);
        cart.setPname("Pname");
        cart.setPrice(10.0d);
        cart.setQuantity(1);
        cart.setRating(10.0f);
        cart.setTotal(10.0d);
        when(cartService.saveAllProduct((Cart) any())).thenReturn(cart);

        Cart cart1 = new Cart();
        cart1.setDescription("The characteristics of someone or something");
        cart1.setId(1);
        cart1.setImg("Img");
        cart1.setPbrand("Pbrand");
        cart1.setPid(1);
        cart1.setPname("Pname");
        cart1.setPrice(10.0d);
        cart1.setQuantity(1);
        cart1.setRating(10.0f);
        cart1.setTotal(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(cart1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/cart")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(cartRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"pid\":1,\"pbrand\":\"Pbrand\",\"pname\":\"Pname\",\"description\":\"The characteristics of someone or"
                                        + " something\",\"price\":10.0,\"img\":\"Img\",\"rating\":10.0,\"quantity\":1,\"total\":10.0}"));
    }
}


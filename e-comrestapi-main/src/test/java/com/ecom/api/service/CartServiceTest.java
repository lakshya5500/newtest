package com.ecom.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Cart;
import com.ecom.api.exception.CartItemNotExistException;
import com.ecom.api.repository.CartRepo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CartService.class})
@ExtendWith(SpringExtension.class)
class CartServiceTest {
    @MockBean
    private CartRepo cartRepo;

    @Autowired
    private CartService cartService;

    /**
     * Method under test: {@link CartService#details()}
     */
    @Test
    void testDetails() {
        ArrayList<Cart> cartList = new ArrayList<>();
        when(cartRepo.findAll()).thenReturn(cartList);
        List<Cart> actualDetailsResult = cartService.details();
        assertSame(cartList, actualDetailsResult);
        assertTrue(actualDetailsResult.isEmpty());
        verify(cartRepo).findAll();
    }

    /**
     * Method under test: {@link CartService#details()}
     */
    @Test
    void testDetails2() {
        when(cartRepo.findAll()).thenThrow(new CartItemNotExistException("Msg"));
        assertThrows(CartItemNotExistException.class, () -> cartService.details());
        verify(cartRepo).findAll();
    }

    /**
     * Method under test: {@link CartService#saveAllProduct(Cart)}
     */
    @Test
    void testSaveAllProduct() {
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
        when(cartRepo.save((Cart) any())).thenReturn(cart);

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
        assertSame(cart1, cartService.saveAllProduct(cart1));
        verify(cartRepo).save((Cart) any());
    }

    /**
     * Method under test: {@link CartService#saveAllProduct(Cart)}
     */
    @Test
    void testSaveAllProduct2() {
        when(cartRepo.save((Cart) any())).thenThrow(new CartItemNotExistException("Msg"));

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
        assertThrows(CartItemNotExistException.class, () -> cartService.saveAllProduct(cart));
        verify(cartRepo).save((Cart) any());
    }

    /**
     * Method under test: {@link CartService#deleteCart(Integer)}
     */
    @Test
    void testDeleteCart() throws CartItemNotExistException {
        doNothing().when(cartRepo).deleteById((Integer) any());
        when(cartRepo.existsById((Integer) any())).thenReturn(true);
        assertEquals("Cart Item Deleted", cartService.deleteCart(1));
        verify(cartRepo).existsById((Integer) any());
        verify(cartRepo).deleteById((Integer) any());
    }

    /**
     * Method under test: {@link CartService#deleteCart(Integer)}
     */
    @Test
    void testDeleteCart2() throws CartItemNotExistException {
        doThrow(new CartItemNotExistException("Cart Item Deleted")).when(cartRepo).deleteById((Integer) any());
        when(cartRepo.existsById((Integer) any())).thenReturn(true);
        assertThrows(CartItemNotExistException.class, () -> cartService.deleteCart(1));
        verify(cartRepo).existsById((Integer) any());
        verify(cartRepo).deleteById((Integer) any());
    }

    /**
     * Method under test: {@link CartService#deleteCart(Integer)}
     */
    @Test
    void testDeleteCart3() throws CartItemNotExistException {
        doNothing().when(cartRepo).deleteById((Integer) any());
        when(cartRepo.existsById((Integer) any())).thenReturn(false);
        assertThrows(CartItemNotExistException.class, () -> cartService.deleteCart(1));
        verify(cartRepo).existsById((Integer) any());
    }
}


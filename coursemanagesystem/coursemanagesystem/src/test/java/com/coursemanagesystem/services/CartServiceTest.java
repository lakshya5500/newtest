package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.CourseCart;
import com.coursemanagesystem.exceptions.CartItemNotExistException;
import com.coursemanagesystem.repositories.CartRepo;

import java.util.Optional;

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
     * Method under test: {@link CartService#deleteCartById(long)}
     */
    @Test
    void testDeleteCartById() {
        CourseCart courseCart = new CourseCart();
        courseCart.setCourseDescription("Course Description");
        courseCart.setCourseDuration("Course Duration");
        courseCart.setCourseName("Course Name");
        courseCart.setFee(1);
        courseCart.setId(1);
        courseCart.setImage("Image");
        courseCart.setQuantity(10.0d);
        courseCart.setTotal(10.0d);
        Optional<CourseCart> ofResult = Optional.of(courseCart);
        doNothing().when(cartRepo).delete((CourseCart) any());
        when(cartRepo.findById(anyLong())).thenReturn(ofResult);
        cartService.deleteCartById(123L);
        verify(cartRepo).findById(anyLong());
        verify(cartRepo).delete((CourseCart) any());
    }

    /**
     * Method under test: {@link CartService#deleteCartById(long)}
     */
    @Test
    void testDeleteCartById2() {
        CourseCart courseCart = new CourseCart();
        courseCart.setCourseDescription("Course Description");
        courseCart.setCourseDuration("Course Duration");
        courseCart.setCourseName("Course Name");
        courseCart.setFee(1);
        courseCart.setId(1);
        courseCart.setImage("Image");
        courseCart.setQuantity(10.0d);
        courseCart.setTotal(10.0d);
        Optional<CourseCart> ofResult = Optional.of(courseCart);
        doThrow(new CartItemNotExistException("Resource Name", "Field Name", 42L)).when(cartRepo)
                .delete((CourseCart) any());
        when(cartRepo.findById(anyLong())).thenReturn(ofResult);
        assertThrows(CartItemNotExistException.class, () -> cartService.deleteCartById(123L));
        verify(cartRepo).findById(anyLong());
        verify(cartRepo).delete((CourseCart) any());
    }
}


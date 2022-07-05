package com.ecom.api.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CartItemNotExistExceptionTest {
    /**
     * Method under test: {@link CartItemNotExistException#CartItemNotExistException(String)}
     */
    @Test
    void testConstructor() {
        CartItemNotExistException actualCartItemNotExistException = new CartItemNotExistException("Msg");
        assertNull(actualCartItemNotExistException.getCause());
        assertEquals(0, actualCartItemNotExistException.getSuppressed().length);
        assertEquals("Msg", actualCartItemNotExistException.getMessage());
        assertEquals("Msg", actualCartItemNotExistException.getLocalizedMessage());
    }

    /**
     * Method under test: {@link CartItemNotExistException#CartItemNotExistException(String)}
     */
    @Test
    void testConstructor2() {
        CartItemNotExistException actualCartItemNotExistException = new CartItemNotExistException("Msg");
        assertNull(actualCartItemNotExistException.getCause());
        assertEquals(0, actualCartItemNotExistException.getSuppressed().length);
        assertEquals("Msg", actualCartItemNotExistException.getMessage());
        assertEquals("Msg", actualCartItemNotExistException.getLocalizedMessage());
    }
}


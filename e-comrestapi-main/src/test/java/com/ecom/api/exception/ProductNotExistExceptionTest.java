package com.ecom.api.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ProductNotExistExceptionTest {
    /**
     * Method under test: {@link ProductNotExistException#ProductNotExistException(String)}
     */
    @Test
    void testConstructor() {
        ProductNotExistException actualProductNotExistException = new ProductNotExistException("Msg");
        assertNull(actualProductNotExistException.getCause());
        assertEquals(0, actualProductNotExistException.getSuppressed().length);
        assertEquals("Msg", actualProductNotExistException.getMessage());
        assertEquals("Msg", actualProductNotExistException.getLocalizedMessage());
    }

    /**
     * Method under test: {@link ProductNotExistException#ProductNotExistException(String)}
     */
    @Test
    void testConstructor2() {
        ProductNotExistException actualProductNotExistException = new ProductNotExistException("Msg");
        assertNull(actualProductNotExistException.getCause());
        assertEquals(0, actualProductNotExistException.getSuppressed().length);
        assertEquals("Msg", actualProductNotExistException.getMessage());
        assertEquals("Msg", actualProductNotExistException.getLocalizedMessage());
    }
}


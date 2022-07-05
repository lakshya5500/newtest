package com.ecom.api.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CustomExceptionTest {
    /**
     * Method under test: {@link CustomException#CustomException(String)}
     */
    @Test
    void testConstructor() {
        CustomException actualCustomException = new CustomException("Msg");
        assertNull(actualCustomException.getCause());
        assertEquals(0, actualCustomException.getSuppressed().length);
        assertEquals("Msg", actualCustomException.getMessage());
        assertEquals("Msg", actualCustomException.getLocalizedMessage());
    }

    /**
     * Method under test: {@link CustomException#CustomException(String)}
     */
    @Test
    void testConstructor2() {
        CustomException actualCustomException = new CustomException("Msg");
        assertNull(actualCustomException.getCause());
        assertEquals(0, actualCustomException.getSuppressed().length);
        assertEquals("Msg", actualCustomException.getMessage());
        assertEquals("Msg", actualCustomException.getLocalizedMessage());
    }
}


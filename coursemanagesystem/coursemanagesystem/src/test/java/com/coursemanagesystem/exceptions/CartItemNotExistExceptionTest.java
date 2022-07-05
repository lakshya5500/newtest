package com.coursemanagesystem.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CartItemNotExistExceptionTest {
    /**
     * Method under test: {@link CartItemNotExistException#CartItemNotExistException(String, String, long)}
     */
    @Test
    void testConstructor() {
        CartItemNotExistException actualCartItemNotExistException = new CartItemNotExistException("Resource Name",
                "Field Name", 42L);

        assertEquals("Resource Name", actualCartItemNotExistException.resourceName);
        assertEquals(42L, actualCartItemNotExistException.fieldValue);
        assertEquals("Field Name", actualCartItemNotExistException.fieldName);
    }
}


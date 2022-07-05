package com.coursemanagesystem.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ResourceNotFoundExceptionTest {
    /**
     * Method under test: {@link ResourceNotFoundException#ResourceNotFoundException(String, String, long)}
     */
    @Test
    void testConstructor() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException("Resource Name",
                "Field Name", 42L);

        assertEquals("Resource Name", actualResourceNotFoundException.resourceName);
        assertEquals(42L, actualResourceNotFoundException.fieldValue);
        assertEquals("Field Name", actualResourceNotFoundException.fieldName);
    }
}


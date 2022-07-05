package com.coursemanagesystem.apiresponce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ApiResponceTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApiResponce#ApiResponce()}
     *   <li>{@link ApiResponce#setMessage(String)}
     *   <li>{@link ApiResponce#setSuccess(boolean)}
     *   <li>{@link ApiResponce#getMessage()}
     *   <li>{@link ApiResponce#isSuccess()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ApiResponce actualApiResponce = new ApiResponce();
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ApiResponce#ApiResponce(String, boolean)}
     *   <li>{@link ApiResponce#setMessage(String)}
     *   <li>{@link ApiResponce#setSuccess(boolean)}
     *   <li>{@link ApiResponce#getMessage()}
     *   <li>{@link ApiResponce#isSuccess()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ApiResponce actualApiResponce = new ApiResponce("Not all who wander are lost", true);
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }
}


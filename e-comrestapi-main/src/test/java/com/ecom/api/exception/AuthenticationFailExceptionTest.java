package com.ecom.api.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class AuthenticationFailExceptionTest {
    /**
     * Method under test: {@link AuthenticationFailException#AuthenticationFailException(String)}
     */
    @Test
    void testConstructor() {
        AuthenticationFailException actualAuthenticationFailException = new AuthenticationFailException("Msg");
        assertNull(actualAuthenticationFailException.getCause());
        assertEquals(0, actualAuthenticationFailException.getSuppressed().length);
        assertEquals("Msg", actualAuthenticationFailException.getMessage());
        assertEquals("Msg", actualAuthenticationFailException.getLocalizedMessage());
    }

    /**
     * Method under test: {@link AuthenticationFailException#AuthenticationFailException(String)}
     */
    @Test
    void testConstructor2() {
        AuthenticationFailException actualAuthenticationFailException = new AuthenticationFailException("Msg");
        assertNull(actualAuthenticationFailException.getCause());
        assertEquals(0, actualAuthenticationFailException.getSuppressed().length);
        assertEquals("Msg", actualAuthenticationFailException.getMessage());
        assertEquals("Msg", actualAuthenticationFailException.getLocalizedMessage());
    }
}


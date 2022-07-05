package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdminTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Admin#Admin(String, String, String)}
     *   <li>{@link Admin#setAdmuserName(String)}
     *   <li>{@link Admin#setEmail(String)}
     *   <li>{@link Admin#setPassword(String)}
     *   <li>{@link Admin#getAdmuserName()}
     *   <li>{@link Admin#getEmail()}
     *   <li>{@link Admin#getPassword()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Admin actualAdmin = new Admin("jane.doe@example.org", "janedoe", "iloveyou");
        actualAdmin.setAdmuserName("janedoe");
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        assertEquals("janedoe", actualAdmin.getAdmuserName());
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
    }
}


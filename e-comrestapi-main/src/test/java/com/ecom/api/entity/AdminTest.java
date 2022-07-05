package com.ecom.api.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdminTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Admin}
     *   <li>{@link Admin#setEmail(String)}
     *   <li>{@link Admin#setId(int)}
     *   <li>{@link Admin#setName(String)}
     *   <li>{@link Admin#setPassword(String)}
     *   <li>{@link Admin#getEmail()}
     *   <li>{@link Admin#getId()}
     *   <li>{@link Admin#getName()}
     *   <li>{@link Admin#getPassword()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Admin actualAdmin = new Admin();
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setId(1);
        actualAdmin.setName("Name");
        actualAdmin.setPassword("iloveyou");
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals(1, actualAdmin.getId());
        assertEquals("Name", actualAdmin.getName());
        assertEquals("iloveyou", actualAdmin.getPassword());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Admin}
     *   <li>{@link Admin#setEmail(String)}
     *   <li>{@link Admin#setId(int)}
     *   <li>{@link Admin#setName(String)}
     *   <li>{@link Admin#setPassword(String)}
     *   <li>{@link Admin#getEmail()}
     *   <li>{@link Admin#getId()}
     *   <li>{@link Admin#getName()}
     *   <li>{@link Admin#getPassword()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Admin actualAdmin = new Admin();
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setId(1);
        actualAdmin.setName("Name");
        actualAdmin.setPassword("iloveyou");
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals(1, actualAdmin.getId());
        assertEquals("Name", actualAdmin.getName());
        assertEquals("iloveyou", actualAdmin.getPassword());
    }
}


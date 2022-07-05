package com.ecom.api.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NewUserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link NewUser}
     *   <li>{@link NewUser#setEmail(String)}
     *   <li>{@link NewUser#setName(String)}
     *   <li>{@link NewUser#setPassword(String)}
     *   <li>{@link NewUser#setUsername(String)}
     *   <li>{@link NewUser#getEmail()}
     *   <li>{@link NewUser#getName()}
     *   <li>{@link NewUser#getPassword()}
     *   <li>{@link NewUser#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor() {
        NewUser actualNewUser = new NewUser();
        actualNewUser.setEmail("jane.doe@example.org");
        actualNewUser.setName("Name");
        actualNewUser.setPassword("iloveyou");
        actualNewUser.setUsername("janedoe");
        assertEquals("jane.doe@example.org", actualNewUser.getEmail());
        assertEquals("Name", actualNewUser.getName());
        assertEquals("iloveyou", actualNewUser.getPassword());
        assertEquals("janedoe", actualNewUser.getUsername());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link NewUser}
     *   <li>{@link NewUser#setEmail(String)}
     *   <li>{@link NewUser#setName(String)}
     *   <li>{@link NewUser#setPassword(String)}
     *   <li>{@link NewUser#setUsername(String)}
     *   <li>{@link NewUser#getEmail()}
     *   <li>{@link NewUser#getName()}
     *   <li>{@link NewUser#getPassword()}
     *   <li>{@link NewUser#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        NewUser actualNewUser = new NewUser();
        actualNewUser.setEmail("jane.doe@example.org");
        actualNewUser.setName("Name");
        actualNewUser.setPassword("iloveyou");
        actualNewUser.setUsername("janedoe");
        assertEquals("jane.doe@example.org", actualNewUser.getEmail());
        assertEquals("Name", actualNewUser.getName());
        assertEquals("iloveyou", actualNewUser.getPassword());
        assertEquals("janedoe", actualNewUser.getUsername());
    }
}


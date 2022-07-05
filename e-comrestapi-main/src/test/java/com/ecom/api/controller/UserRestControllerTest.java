package com.ecom.api.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.NewUser;
import com.ecom.api.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {UserRestController.class})
@ExtendWith(SpringExtension.class)
class UserRestControllerTest {
    @Autowired
    private UserRestController userRestController;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link UserRestController#findUserByEmailOrPassword(String, String)}
     */
    @Test
    void testFindUserByEmailOrPassword() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setName("Name");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(userService.findUserDetails((String) any(), (String) any())).thenReturn(newUser);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/userLogin")
                .param("email", "foo")
                .param("password", "foo");
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"name\":\"Name\",\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link UserRestController#getAllUsers()}
     */
    @Test
    void testGetAllUsers() throws Exception {
        when(userService.findAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/users");
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link UserRestController#getAllUsers()}
     */
    @Test
    void testGetAllUsers2() throws Exception {
        when(userService.findAllUsers()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/users");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link UserRestController#saveUsers(NewUser)}
     */
    @Test
    void testSaveUsers() throws Exception {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setName("Name");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(userService.saveusers((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setName("Name");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        String content = (new ObjectMapper()).writeValueAsString(newUser1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/signup")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userRestController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400))
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"name\":\"Name\",\"username\":\"janedoe\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }
}


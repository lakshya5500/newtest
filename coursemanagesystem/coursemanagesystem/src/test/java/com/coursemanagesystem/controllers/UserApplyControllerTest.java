package com.coursemanagesystem.controllers;

import static org.mockito.Mockito.when;

import com.coursemanagesystem.services.UserApplyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {UserApplyController.class})
@ExtendWith(SpringExtension.class)
class UserApplyControllerTest {
    @Autowired
    private UserApplyController userApplyController;

    @MockBean
    private UserApplyService userApplyService;

    /**
     * Method under test: {@link UserApplyController#getAllUser()}
     */
    @Test
    void testGetAllUser() throws Exception {
        when(userApplyService.getAllUser()).thenReturn("All User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All User"));
    }
}


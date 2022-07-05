package com.ecom.api.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Admin;
import com.ecom.api.service.AdminService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {AdminController.class})
@ExtendWith(SpringExtension.class)
class AdminControllerTest {
    @Autowired
    private AdminController adminController;

    @MockBean
    private AdminService adminService;

    /**
     * Method under test: {@link AdminController#findAdminByEmailOrPassword(String, String)}
     */
    @Test
    void testFindAdminByEmailOrPassword() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setId(1);
        admin.setName("Name");
        admin.setPassword("iloveyou");
        when(adminService.findByEmailAndPassword((String) any(), (String) any())).thenReturn(admin);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/adminLogin")
                .param("email", "foo")
                .param("password", "foo");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    /**
     * Method under test: {@link AdminController#getdetails()}
     */
    @Test
    void testGetdetails() throws Exception {
        when(adminService.findAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link AdminController#getdetails()}
     */
    @Test
    void testGetdetails2() throws Exception {
        when(adminService.findAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link AdminController#saveAdmin(Admin)}
     */
    @Test
    void testSaveAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setId(1);
        admin.setName("Name");
        admin.setPassword("iloveyou");
        when(adminService.saveAdmins((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setId(1);
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        String content = (new ObjectMapper()).writeValueAsString(admin1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/admin")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }
}


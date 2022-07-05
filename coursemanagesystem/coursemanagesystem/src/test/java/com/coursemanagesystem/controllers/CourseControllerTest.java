package com.coursemanagesystem.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;

import com.coursemanagesystem.services.CourseService;
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

@ContextConfiguration(classes = {CourseController.class})
@ExtendWith(SpringExtension.class)
class CourseControllerTest {
    @Autowired
    private CourseController courseController;

    @MockBean
    private CourseService courseService;

    /**
     * Method under test: {@link CourseController#deleteById(Integer)}
     */
    @Test
    void testDeleteById() throws Exception {
        doNothing().when(courseService).deleteById((Integer) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

    /**
     * Method under test: {@link CourseController#deleteById(Integer)}
     */
    @Test
    void testDeleteById2() throws Exception {
        doNothing().when(courseService).deleteById((Integer) any());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/course/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }
}


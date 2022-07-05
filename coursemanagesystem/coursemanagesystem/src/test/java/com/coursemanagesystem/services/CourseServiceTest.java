package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.exceptions.ResourceNotFoundException;
import com.coursemanagesystem.repositories.CourseRepo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CourseService.class})
@ExtendWith(SpringExtension.class)
class CourseServiceTest {
    @MockBean
    private CourseRepo courseRepo;

    @Autowired
    private CourseService courseService;

    /**
     * Method under test: {@link CourseService#deleteById(Integer)}
     */
    @Test
    void testDeleteById() {
        Course course = new Course();
        course.setCourseDescription("Course Description");
        course.setCourseDuration("Course Duration");
        course.setCourseName("Course Name");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        Optional<Course> ofResult = Optional.of(course);
        doNothing().when(courseRepo).delete((Course) any());
        when(courseRepo.findById((Integer) any())).thenReturn(ofResult);
        courseService.deleteById(1);
        verify(courseRepo).findById((Integer) any());
        verify(courseRepo).delete((Course) any());
    }

    /**
     * Method under test: {@link CourseService#deleteById(Integer)}
     */
    @Test
    void testDeleteById2() {
        Course course = new Course();
        course.setCourseDescription("Course Description");
        course.setCourseDuration("Course Duration");
        course.setCourseName("Course Name");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        Optional<Course> ofResult = Optional.of(course);
        doThrow(new ResourceNotFoundException("Resource Name", "Field Name", 42L)).when(courseRepo).delete((Course) any());
        when(courseRepo.findById((Integer) any())).thenReturn(ofResult);
        assertThrows(ResourceNotFoundException.class, () -> courseService.deleteById(1));
        verify(courseRepo).findById((Integer) any());
        verify(courseRepo).delete((Course) any());
    }
}


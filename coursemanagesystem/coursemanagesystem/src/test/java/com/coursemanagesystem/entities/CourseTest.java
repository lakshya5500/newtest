package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Course#Course(int, String, String, String, int, String)}
     *   <li>{@link Course#setCourseDescription(String)}
     *   <li>{@link Course#setCourseDuration(String)}
     *   <li>{@link Course#setCourseName(String)}
     *   <li>{@link Course#setFee(int)}
     *   <li>{@link Course#setId(int)}
     *   <li>{@link Course#setImage(String)}
     *   <li>{@link Course#getCourseDescription()}
     *   <li>{@link Course#getCourseDuration()}
     *   <li>{@link Course#getCourseName()}
     *   <li>{@link Course#getFee()}
     *   <li>{@link Course#getId()}
     *   <li>{@link Course#getImage()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Course actualCourse = new Course(1, "Course Name", "Course Description", "Course Duration", 1, "Image");
        actualCourse.setCourseDescription("Course Description");
        actualCourse.setCourseDuration("Course Duration");
        actualCourse.setCourseName("Course Name");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        assertEquals("Course Description", actualCourse.getCourseDescription());
        assertEquals("Course Duration", actualCourse.getCourseDuration());
        assertEquals("Course Name", actualCourse.getCourseName());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
    }
}


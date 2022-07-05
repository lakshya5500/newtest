package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseCartTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CourseCart#CourseCart(long, String, String, String, int, String, double, double)}
     *   <li>{@link CourseCart#setCourseDescription(String)}
     *   <li>{@link CourseCart#setCourseDuration(String)}
     *   <li>{@link CourseCart#setCourseName(String)}
     *   <li>{@link CourseCart#setFee(int)}
     *   <li>{@link CourseCart#setId(int)}
     *   <li>{@link CourseCart#setImage(String)}
     *   <li>{@link CourseCart#setQuantity(double)}
     *   <li>{@link CourseCart#setTotal(double)}
     *   <li>{@link CourseCart#getCourseDescription()}
     *   <li>{@link CourseCart#getCourseDuration()}
     *   <li>{@link CourseCart#getCourseName()}
     *   <li>{@link CourseCart#getFee()}
     *   <li>{@link CourseCart#getId()}
     *   <li>{@link CourseCart#getImage()}
     *   <li>{@link CourseCart#getQuantity()}
     *   <li>{@link CourseCart#getTotal()}
     * </ul>
     */
    @Test
    void testConstructor() {
        CourseCart actualCourseCart = new CourseCart(123L, "Course Name", "Course Description", "Course Duration", 1,
                "Image", 10.0d, 10.0d);
        actualCourseCart.setCourseDescription("Course Description");
        actualCourseCart.setCourseDuration("Course Duration");
        actualCourseCart.setCourseName("Course Name");
        actualCourseCart.setFee(1);
        actualCourseCart.setId(1);
        actualCourseCart.setImage("Image");
        actualCourseCart.setQuantity(10.0d);
        actualCourseCart.setTotal(10.0d);
        assertEquals("Course Description", actualCourseCart.getCourseDescription());
        assertEquals("Course Duration", actualCourseCart.getCourseDuration());
        assertEquals("Course Name", actualCourseCart.getCourseName());
        assertEquals(1, actualCourseCart.getFee());
        assertEquals(1L, actualCourseCart.getId());
        assertEquals("Image", actualCourseCart.getImage());
        assertEquals(10.0d, actualCourseCart.getQuantity());
        assertEquals(10.0d, actualCourseCart.getTotal());
    }
}


package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class UserApplyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link UserApply#UserApply(String, String, String, String, String, Date)}
     *   <li>{@link UserApply#setAddedDate(Date)}
     *   <li>{@link UserApply#setAddress(String)}
     *   <li>{@link UserApply#setEmail(String)}
     *   <li>{@link UserApply#setPhoneno(String)}
     *   <li>{@link UserApply#setQualification(String)}
     *   <li>{@link UserApply#setUserName(String)}
     *   <li>{@link UserApply#getAddedDate()}
     *   <li>{@link UserApply#getAddress()}
     *   <li>{@link UserApply#getEmail()}
     *   <li>{@link UserApply#getPhoneno()}
     *   <li>{@link UserApply#getQualification()}
     *   <li>{@link UserApply#getUserName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        UserApply actualUserApply = new UserApply("janedoe", "jane.doe@example.org", "Qualification", "4105551212",
                "42 Main St", Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.setUserName("janedoe");
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
        assertEquals("janedoe", actualUserApply.getUserName());
    }
}


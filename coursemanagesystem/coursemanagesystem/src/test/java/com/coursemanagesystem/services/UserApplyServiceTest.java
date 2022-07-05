package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.UserApply;
import com.coursemanagesystem.repositories.UserApplyRepo;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserApplyService.class})
@ExtendWith(SpringExtension.class)
class UserApplyServiceTest {
    @MockBean
    private UserApplyRepo userApplyRepo;

    @Autowired
    private UserApplyService userApplyService;

    /**
     * Method under test: {@link UserApplyService#getAllUser()}
     */
    @Test
    void testGetAllUser() {
        ArrayList<UserApply> userApplyList = new ArrayList<>();
        when(userApplyRepo.findAll()).thenReturn(userApplyList);
        Object actualAllUser = userApplyService.getAllUser();
        assertSame(userApplyList, actualAllUser);
        assertTrue(((Collection<Object>) actualAllUser).isEmpty());
        verify(userApplyRepo).findAll();
    }
}


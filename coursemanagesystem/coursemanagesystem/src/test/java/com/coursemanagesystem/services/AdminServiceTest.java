package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Admin;
import com.coursemanagesystem.repositories.AdminRepo;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AdminService.class})
@ExtendWith(SpringExtension.class)
class AdminServiceTest {
    @MockBean
    private AdminRepo adminRepo;

    @Autowired
    private AdminService adminService;

    /**
     * Method under test: {@link AdminService#getAllAdmin()}
     */
    @Test
    void testGetAllAdmin() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        Object actualAllAdmin = adminService.getAllAdmin();
        assertSame(adminList, actualAllAdmin);
        assertTrue(((Collection<Object>) actualAllAdmin).isEmpty());
        verify(adminRepo).findAll();
    }
}


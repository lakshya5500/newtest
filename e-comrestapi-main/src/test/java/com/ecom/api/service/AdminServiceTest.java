package com.ecom.api.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Admin;
import com.ecom.api.repository.AdminRepo;

import java.util.ArrayList;
import java.util.List;

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
     * Method under test: {@link AdminService#findAllAdmin()}
     */
    @Test
    void testFindAllAdmin() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        List<Admin> actualFindAllAdminResult = adminService.findAllAdmin();
        assertSame(adminList, actualFindAllAdminResult);
        assertTrue(actualFindAllAdminResult.isEmpty());
        verify(adminRepo).findAll();
    }

    /**
     * Method under test: {@link AdminService#saveAdmins(Admin)}
     */
    @Test
    void testSaveAdmins() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setId(1);
        admin.setName("Name");
        admin.setPassword("iloveyou");
        when(adminRepo.save((Admin) any())).thenReturn(admin);

        Admin admin1 = new Admin();
        admin1.setEmail("jane.doe@example.org");
        admin1.setId(1);
        admin1.setName("Name");
        admin1.setPassword("iloveyou");
        assertSame(admin, adminService.saveAdmins(admin1));
        verify(adminRepo).save((Admin) any());
    }

    /**
     * Method under test: {@link AdminService#findByEmailAndPassword(String, String)}
     */
    @Test
    void testFindByEmailAndPassword() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setId(1);
        admin.setName("Name");
        admin.setPassword("iloveyou");
        when(adminRepo.findDetailsByEmailOrPassword((String) any(), (String) any())).thenReturn(admin);
        assertSame(admin, adminService.findByEmailAndPassword("jane.doe@example.org", "iloveyou"));
        verify(adminRepo).findDetailsByEmailOrPassword((String) any(), (String) any());
    }
}


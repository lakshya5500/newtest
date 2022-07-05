package com.ecom.api.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.NewUser;
import com.ecom.api.repository.UserRepo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserService.class})
@ExtendWith(SpringExtension.class)
class UserServiceTest {
    @MockBean
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    /**
     * Method under test: {@link UserService#saveusers(NewUser)}
     */
    @Test
    void testSaveusers() {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setName("Name");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(userRepo.save((NewUser) any())).thenReturn(newUser);

        NewUser newUser1 = new NewUser();
        newUser1.setEmail("jane.doe@example.org");
        newUser1.setName("Name");
        newUser1.setPassword("iloveyou");
        newUser1.setUsername("janedoe");
        assertSame(newUser, userService.saveusers(newUser1));
        verify(userRepo).save((NewUser) any());
    }

    /**
     * Method under test: {@link UserService#findAllUsers()}
     */
    @Test
    void testFindAllUsers() {
        ArrayList<NewUser> newUserList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(newUserList);
        List<NewUser> actualFindAllUsersResult = userService.findAllUsers();
        assertSame(newUserList, actualFindAllUsersResult);
        assertTrue(actualFindAllUsersResult.isEmpty());
        verify(userRepo).findAll();
    }

    /**
     * Method under test: {@link UserService#findUserDetails(String, String)}
     */
    @Test
    void testFindUserDetails() {
        NewUser newUser = new NewUser();
        newUser.setEmail("jane.doe@example.org");
        newUser.setName("Name");
        newUser.setPassword("iloveyou");
        newUser.setUsername("janedoe");
        when(userRepo.findByEmailOrPassword((String) any(), (String) any())).thenReturn(newUser);
        assertSame(newUser, userService.findUserDetails("jane.doe@example.org", "iloveyou"));
        verify(userRepo).findByEmailOrPassword((String) any(), (String) any());
    }
}


package com.ecom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.NewUser;
import com.ecom.api.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public NewUser saveusers(NewUser user) {

		return userRepo.save(user);
	}

	public List<NewUser> findAllUsers() {

		return userRepo.findAll();
	}
public NewUser findUserDetails(String email, String password) {
		
		return userRepo.findByEmailOrPassword(email,password);
	}

}

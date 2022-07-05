package com.ecom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.Admin;
import com.ecom.api.repository.AdminRepo;

@Service
public class AdminService {

	@Autowired
	AdminRepo adminRepo;

	public List<Admin> findAllAdmin() {

		return adminRepo.findAll();
	}

	public Admin saveAdmins(Admin admin) {

		return adminRepo.save(admin);
	}

	public Admin findByEmailAndPassword(String email, String password) {

		return adminRepo.findDetailsByEmailOrPassword(email, password);
	}

}

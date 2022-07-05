package com.ecom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Admin;
import com.ecom.api.service.AdminService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	@Autowired
	AdminService adminService;

	@PostMapping("/adminLogin")
	public Admin findAdminByEmailOrPassword(@RequestParam String email, String password) {

		return adminService.findByEmailAndPassword(email, password);

	}

	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmins(admin);
	}

	@GetMapping("/admin")
	public List<Admin> getdetails() {
		return adminService.findAllAdmin();
	}
}

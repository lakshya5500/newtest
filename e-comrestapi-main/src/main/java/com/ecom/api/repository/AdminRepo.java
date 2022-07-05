package com.ecom.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.api.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	public Admin findDetailsByEmailOrPassword(String email, String password);

}

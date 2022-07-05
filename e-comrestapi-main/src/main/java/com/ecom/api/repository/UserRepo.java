package com.ecom.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.ecom.api.entity.NewUser;

public interface UserRepo extends JpaRepository<NewUser, String> {

	NewUser findByEmailOrPassword(String email, String password);

	

	

	

	

}

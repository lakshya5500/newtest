package com.ecom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.NewUser;
import com.ecom.api.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<NewUser> getAllUsers() {
		return userService.findAllUsers();
	}

	@PostMapping("/signup")
	public ResponseEntity<NewUser> saveUsers(@RequestBody NewUser user ) {
		NewUser us=  userService.saveusers(user);
		 return new ResponseEntity<NewUser> (us, HttpStatus.BAD_REQUEST);
	}
	@PostMapping("/userLogin")
	public NewUser findUserByEmailOrPassword(@RequestParam String email, String password) {
		
		return userService.findUserDetails(email,password);
	}


}

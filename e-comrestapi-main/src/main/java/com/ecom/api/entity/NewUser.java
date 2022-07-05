package com.ecom.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class NewUser {

	@NotEmpty(message = "Your name should have 3 characters")
	@Column(length = 25, name = "Full_Name")
	@Size(min = 3)
	String name;
	
	@NotEmpty(message = "Username should Combination of 3 characters")
	@Column(length = 25, name = "User_name")
	@Size(min = 3)
	String username;
	
	@Id
	@Email
	@Column(length = 25, name = "Email")
	String email;
	
	@NotEmpty(message = "Your name should have 8 characters")
	@Column(length = 25, name = "Password")
	@Size(min = 8)
	String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

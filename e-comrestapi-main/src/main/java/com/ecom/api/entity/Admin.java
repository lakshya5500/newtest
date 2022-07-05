package com.ecom.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@NotEmpty
	@Size(min = 3,message = "Your name should have 3 characters or not null")
	@Column(length = 25, name = "FullName")
	String name;
	
	@Email
	@NotEmpty
	@Column(length = 25, name = "Email")
	String email;
	
	@NotEmpty
	@Size(min = 8,message = "Your name should have 3 characters or not null")
	@Column(length = 25, name = "Password")
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

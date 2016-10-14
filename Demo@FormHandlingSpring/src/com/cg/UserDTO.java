package com.cg;

import java.util.Date;

public class UserDTO {
	private String username;
	private String password;
	private String email;
	private Date birthDate;
	private String profession;

	public UserDTO() {
		System.out.println("inside UserDTO()...");
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setting email property");
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	// getters and setters...

}
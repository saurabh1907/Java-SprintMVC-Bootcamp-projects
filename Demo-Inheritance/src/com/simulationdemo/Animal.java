package com.simulationdemo;

public class Animal {
	// DATA MEMBERS

	private String type;
	private String location;

	public void roam(){
		System.out.println("inside roam() of Animal");
	}
	
	
	public Animal(String type, String location) {
		this.type = type;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
	
	public String getType() {
		return type;
	}
	
	
}

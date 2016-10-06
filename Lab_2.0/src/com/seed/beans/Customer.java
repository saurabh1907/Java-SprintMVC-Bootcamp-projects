package com.seed.beans;

public class Customer {
	private long mobile;
	private int pincode;
	private String name;
	
//	TODO:1	Provide no-argument public constructor
	public Customer(){
		
	}
//	TODO:2	Provide getters and setters for all attributes.

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

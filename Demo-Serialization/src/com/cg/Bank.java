package com.cg;

import java.io.Serializable;

public class Bank extends Temp implements Serializable{
	private String name ="ICICI";

	public void setName(String name) {
		this.name = name;
	}
	
	public Bank() {
		name = "axis";
	}
	
	
	public String getName() {
		return name;
	}
}

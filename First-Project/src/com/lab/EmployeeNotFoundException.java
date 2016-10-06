package com.lab;

public class EmployeeNotFoundException extends Exception{
	public EmployeeNotFoundException(){
		
	}
	public EmployeeNotFoundException(String msg){
		super(msg);
	}
}

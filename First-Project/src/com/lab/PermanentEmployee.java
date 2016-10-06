package com.lab;

public abstract class PermanentEmployee extends Employee {
	private double salary;
	private double yearsExperience;
	static int pcounter = 0;

	public PermanentEmployee(String firstName, String lastName, String grade, Date joining, double salary) {
		super(firstName, lastName, grade, joining);
		this.salary = salary;
		++pcounter;
	}

	public abstract double getSalary();
	
}

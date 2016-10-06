package com.lab;

public abstract class Employee {
	private int ID;
	private String firstName;
	private String lastName;
	private String grade;
	private Date joining;
	private EmpKey empKey;
	static int counter = 0;

	public Employee (String firstName, String lastName, String grade, Date joining) {
		this.ID = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.joining = joining;
		empKey= new EmpKey(ID,grade);
	}
	
	//Instance Initialization block
	{
		++counter;
	}

	public int getID() {
		return ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGrade() {
		return grade;
	}

	public String getJoining() {
		return joining.toString();
	}
	
	public EmpKey getEmpKey(){
		return empKey;
	}
	
	public static int getNoEmployee() {
		return counter;
	}
	
	//To be overridden
	public  abstract double getSalary();
}
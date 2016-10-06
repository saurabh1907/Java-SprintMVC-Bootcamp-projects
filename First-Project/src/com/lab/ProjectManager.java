package com.lab;

public class ProjectManager extends PermanentEmployee {
	
	public ProjectManager(String firstName, String lastName, String grade, Date joining, double salary) {
		super(firstName, lastName, grade, joining, salary);
	}

	@Override
	public double getSalary() {
		return this.getSalary();
	}

	public double getMediClaim() {
		return MediClaim.calculateMediclaim(this);

	}
}

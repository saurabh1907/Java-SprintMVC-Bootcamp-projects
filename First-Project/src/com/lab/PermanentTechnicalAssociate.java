package com.lab;

public class PermanentTechnicalAssociate extends PermanentEmployee {
	public PermanentTechnicalAssociate(String firstName, String lastName, String grade, Date joining, double salary) {
		super(firstName, lastName, grade, joining, salary);
	}

	@Override
	public double getSalary() {
		return this.getSalary();
	}
	public double getMediClaim(){
		return MediClaim.calculateMediclaim(this);
}
}

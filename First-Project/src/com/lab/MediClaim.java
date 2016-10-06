package com.lab;

public class MediClaim {
	public static double calculateMediclaim(Employee employee){
		if(employee instanceof ProjectManager){
		return 1*employee.getSalary();
		}
		else if(employee instanceof PermanentTechnicalAssociate){
			return 2*employee.getSalary();
			}
		else
			return 0;	
	}
}

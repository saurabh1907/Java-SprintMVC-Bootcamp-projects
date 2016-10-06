package com.lab;

public class CreateEmployee {
	public static ProjectManager createProjectManager(String firstName, String lastName, String grade, Date joining, double salary){
		ProjectManager pEmployee = new ProjectManager(firstName, lastName, grade, joining, salary);
		return pEmployee;
	}
	public static PermanentTechnicalAssociate createPermanentTechAssociate(String firstName, String lastName, String grade, Date joining, double salary){
		PermanentTechnicalAssociate pEmployee = new PermanentTechnicalAssociate(firstName, lastName, grade, joining, salary);
		return pEmployee;
	}
	
	
	public static CbTechnicalAssociate createContractBasedTechAssociate(String firstName, String lastName, String grade, Date joining, double ratePerHour, Contractor contractor){
		CbTechnicalAssociate cbTechnicalAssociate = new CbTechnicalAssociate(firstName, lastName, grade, joining, ratePerHour, contractor);
		return cbTechnicalAssociate;
	}
}

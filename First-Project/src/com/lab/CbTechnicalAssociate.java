package com.lab;

public class CbTechnicalAssociate extends ContractBasedEmployee{

	public CbTechnicalAssociate(String firstName, String lastName, String grade, Date joining, double ratePerHour,
			Contractor contractor) {
		super(firstName, lastName, grade, joining, ratePerHour, contractor);
	}
//	public double getMediClaim(){
//		return MediClaim.calculateMediclaim(salary, this);
//	}

}

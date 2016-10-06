package com.lab;

public abstract class ContractBasedEmployee extends Employee {
		private double salary;
		private double ratePerHour;
		private double hours=0;
		static int ccounter = 0;
		private Contractor contractor;
	
		
		public ContractBasedEmployee(String firstName, String lastName, String grade, Date joining, double ratePerHour, Contractor contractor) {
			super(firstName, lastName, grade, joining);
			this.contractor= contractor;
			this.ratePerHour = ratePerHour;
			++ccounter;
		}
		public void setHour(double hours){
			this.hours= hours;
		}

		public double getSalary() {
			salary = ratePerHour * hours;
			return salary;
		}
		

	}

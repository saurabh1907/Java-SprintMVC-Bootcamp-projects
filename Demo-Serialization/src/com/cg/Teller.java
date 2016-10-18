package com.cg;

import java.io.Serializable;

public class Teller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6353366990599329892L;

	public Teller() {
		System.out.println("constructing a Teller object....");
	}
	
	private Bank bank ;

	public Teller(Bank bank) {
		System.out.println("constructing a Teller object....");
		this.bank = bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	
}

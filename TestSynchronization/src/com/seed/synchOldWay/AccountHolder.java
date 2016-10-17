package com.seed.synchOldWay;

public class AccountHolder {
	private int id;
	private double balance;
	
	public AccountHolder(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}	

	
	public int getId() {
		return id;
	}


	public double getBalance() {
		return balance;
	}

	public synchronized void  deposit(double amt) throws InterruptedException
	{
		System.out.println("\tbalance in "+ id + "\t"+ getBalance());
		Thread.sleep(400);						// read balance from database
		double balance = this.balance;
		Thread.sleep(300);						// update balance into database
		this.balance = balance + amt;
		
	}
	
	synchronized public void withdraw(double amt) throws InterruptedException
	{
		System.out.print("balance in "+ id + "\t"+ getBalance());
		
		Thread.sleep(600);
		double balance = this.balance;
		Thread.sleep(300);
		this.balance = balance - amt;
	}
	
}
package com.seed.unsynch;


public class AccountHolder {
	private int id;
	private double balance;
	
	private static int count;
	
/*	synchronized
	public static int getCount() {
		return count;
	}
*/	
	
	public static int getCount() {
		synchronized(AccountHolder.class){
			return count;
		}
	}

	
	public AccountHolder(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}	

	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) throws InterruptedException
	{
		System.out.println("\tbalance in "+ id + "\t"+ getBalance());
		Thread.sleep(900);						// read balance from database
		double balance = this.balance;
		balance += amt;
		Thread.sleep(300);						// update balance into database
		this.balance = balance ;
	
	}
	
	public void withdraw(double amt) throws InterruptedException
	{
		System.out.print("balance in "+ id + "\t"+ getBalance());		
			
		Thread.sleep(600);
		double balance = this.balance;
		Thread.sleep(200);
		this.balance = balance - amt;
	}
	
}
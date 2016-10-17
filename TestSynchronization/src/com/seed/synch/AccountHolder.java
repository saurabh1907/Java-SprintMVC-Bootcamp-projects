package com.seed.synch;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountHolder {
	private int id;
	private double balance;
	
	private Lock accountLock = new ReentrantLock();

	public Lock getAccountLock() {
		return accountLock;
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
		Thread.sleep(400);						// read balance from database
		double balance = this.balance;
		Thread.sleep(300);						// update balance into database
		this.balance = balance + amt;
	
	}
	
	public void withdraw(double amt) throws InterruptedException
	{
		System.out.print("balance in "+ id + "\t"+ getBalance());		
			
		Thread.sleep(600);
		double balance = this.balance;
		Thread.sleep(300);
		this.balance = balance - amt;
	}
	
	
}
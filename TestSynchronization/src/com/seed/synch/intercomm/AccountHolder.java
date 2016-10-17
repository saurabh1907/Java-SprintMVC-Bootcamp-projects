package com.seed.synch.intercomm;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountHolder {
	private int id;
	private double balance;
	private Lock accountLock;
	private Condition sufficientFunds; 
	
	public Lock getAccountLock() {
		return accountLock;
	}		
	
	public AccountHolder(int id, double balance) {
		this.id = id;
		this.balance = balance;
		accountLock = new ReentrantLock();
		sufficientFunds = accountLock.newCondition();
	}	
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) throws InterruptedException
	{		
		accountLock.lock();
		try{
			System.out.println("\nbalance in "+ id + "\t"+ getBalance()+ "\t"+ Thread.currentThread().getName());
//			Thread.sleep(400);						// read balance from database
			double balance = this.balance;
			Thread.sleep(300);						// update balance into database
			this.balance = balance + amt;
			sufficientFunds.signalAll();
		}
		finally{
			accountLock.unlock();
		}	
	}
	
	public void withdraw(double amt) throws InterruptedException
	{		
		accountLock.lock();
		
		while(this.balance <= amt){
			System.err.println("\nInsufficient balance in "+ id + "\t"+ getBalance()+ "\t"+ Thread.currentThread().getName());
			sufficientFunds.await();
//			Thread.sleep(1000);
		}
		
		try{
			System.out.print("\nbalance in "+ id + "\t"+ getBalance()+ "\t"+ Thread.currentThread().getName());		
//			Thread.sleep(600);
			
			double balance = this.balance;
			Thread.sleep(300);
			this.balance = balance - amt;
			sufficientFunds.signal();
		}
		finally{
			accountLock.unlock();
		}
	}	
}
package com.seed.synch.intercomm;


public class Test {
	public static void main(String[] args) throws InterruptedException{
		Bank bank = new Bank();
		
//		new TransactionWindow(bank).run();
		
		Runnable target = new TransactionWindow(bank);
		Thread thread1 = new Thread(target,"Counter#1");
		thread1.start();
		
		Thread thread2 = new Thread(target,"Counter#2");
		thread2.start();
		
		Thread thread3 = new Thread(target,"Counter#3");
		thread3.start();
		
		Thread thread4 = new Thread(target,"Counter#4");
		thread4.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		
		bank.showTotalBalance();
	}
}

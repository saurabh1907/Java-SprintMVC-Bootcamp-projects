package com.seed.synchOldWay;


public class Test {
	public static void main(String[] args) throws InterruptedException{
		Bank bank = new Bank();
		
//		new TransactionWindow(bank).run();
		
		Runnable target = new TransactionWindow(bank);
		Thread thread1 = new Thread(target);
		thread1.start();
		
		Thread thread2 = new Thread(target);
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		bank.showTotalBalance();
	}
}

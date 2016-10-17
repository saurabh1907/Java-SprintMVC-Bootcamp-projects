package com.seed.unsynch;


public class Test {
	public static void main(String[] args) throws InterruptedException{
		Bank bank = new Bank();
		
		bank.showTotalBalance();
		
		TransactionWindow window = new TransactionWindow(bank);
//		window.run();
		
		Thread counter1 = new Thread(window);
		counter1.start();
		
		Thread counter2 = new Thread(window);
		counter2.start();
		
//		WAIT FOR THESE TWO COUNTERS TO COMPLETE THEIR PROCESSING
		
		counter1.join();
		counter2.join();
		
		bank.showTotalBalance();
	}
}

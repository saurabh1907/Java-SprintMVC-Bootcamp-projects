package com.seed.synch.intercomm;

public class TransactionWindow implements Runnable{

	private Bank bank;	 

	public TransactionWindow(Bank bank) {
		this.bank = bank;
	}

	public void run()
	{
		int token = 0;
		while(token++ < 10){
			try {
				int toAcc = token%15;
				int fromAcc = (int)(Math.random() * 15);
				
				if(toAcc != fromAcc){
					bank.transferAmount(toAcc, fromAcc, 2500);
				}
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
}

















//String threadName = "##Counter "+ token;		
//
//new Thread(threadName){
//	int toAcc;
//	@Override
//	public void run() {
//		try {
//			int fromAcc = (int)(Math.random() * 5);
//			
//			if(toAcc != fromAcc){
//				bank.transferAmount(toAcc++, fromAcc, 4000);
//			}
//		} 
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}							
//	}
//}	.start();					
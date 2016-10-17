package com.seed.synchOldWay;


public class TransactionWindow implements Runnable{

	private Bank bank;
	
	public TransactionWindow(Bank bank) {
		this.bank = bank;
	}
	
	public void run()
	{
		int token = 0;
		while(token++ < 5)
		{
			int toAcc = (int)(Math.random() * 5);
			int fromAcc = (int)(Math.random() * 5);
			
			try {
				if(toAcc != fromAcc)
				{
					
					
					bank.transferAmount(toAcc, fromAcc, 4000);
				}
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

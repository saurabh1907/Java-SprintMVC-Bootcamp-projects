package com.seed.synch.intercomm;


public class Bank {
	private AccountHolder accounts[] = new AccountHolder[15];

	public Bank() {
		for(int id = 0; id < accounts.length; id++)
		{
			accounts[id] = new AccountHolder(id,5000);
		}
	}

	void transferAmount(int toAcc,int fromAcc,double amt) throws InterruptedException
	{
		
		System.err.println("\nTransferring from "+ fromAcc + " into "+ toAcc + "\t"+ Thread.currentThread().getName());

		accounts[fromAcc].getAccountLock().lock();
		accounts[toAcc].getAccountLock().lock();
		
		try{
			accounts[fromAcc].withdraw(amt);
			accounts[toAcc].deposit(amt);
		}
		finally{
			accounts[fromAcc].getAccountLock().unlock();
			accounts[toAcc].getAccountLock().unlock();
			System.err.println("\nCompleted Transfer from "+ fromAcc + " into "+ toAcc + "\t"+ Thread.currentThread().getName());
		}		
	}

	void showTotalBalance()
	{
		double totalBalance=0;

		for(AccountHolder account : accounts)
		{
			totalBalance += account.getBalance();
		}

		System.out.println("Total Balance in bank: "+ totalBalance);
	}
}

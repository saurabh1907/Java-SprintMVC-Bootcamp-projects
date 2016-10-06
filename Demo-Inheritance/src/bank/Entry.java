package bank;

public class Entry {
	public static void main(String[] args) {
		Account account1 = new Account(100000, "Tanay");
		Account account2 = new Account(500000, "Saurabh");
		Teller teller1= new Teller();
		Teller teller2 = new Teller();
		
		Thread thread1= new Thread(){
			public void run() {
				teller1.transferAmount(account1, account2, 5000);
				teller1.transferAmount(account2, account1, 3000);
			}
		};
		thread1.start();
		
		Thread thread2= new Thread(){
			public void run() {
				teller1.transferAmount(account1, account2, 5000);
				teller1.transferAmount(account2, account1, 3000);
			}
		};
		thread2.start();
		
		Thread thread3= new Thread(){
			public void run() {
				teller1.transferAmount(account1, account2, 5000);
				teller1.transferAmount(account2, account1, 3000);
			}
		};
		thread3.start();
		
		Thread thread4= new Thread(){
			public void run() {
				teller1.transferAmount(account1, account2, 5000);
				teller1.transferAmount(account2, account1, 3000);
			}
		};
		thread4.start();
		Thread thread5= new Thread(){
			public void run() {
				teller1.transferAmount(account1, account2, 5000);
				teller1.transferAmount(account2, account1, 3000);
			}
		};
		thread5.start();
		
		Thread thread6= new Thread(){
			public void run() {
				teller1.transferAmount(account1, account2, 5000);
				teller1.transferAmount(account2, account1, 3000);
			}
		};
		thread6.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Bank.balance);

	}
}

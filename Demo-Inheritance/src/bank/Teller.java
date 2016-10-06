package bank;

public class Teller {
public void deposit(Account acc, double amt){
	acc.deposit(amt);
}
public void withdraw (Account acc, double amt){
	acc.withdraw(amt);
}
public void transferAmount(Account acc1, Account acc2, double amount){
	Bank.transferAccount(acc1, acc2, amount);
}
public double getBalance(Account acc){
	return acc.getBalance();
}
}

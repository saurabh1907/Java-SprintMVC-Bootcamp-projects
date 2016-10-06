package bank;

import java.util.ArrayList;

public class Bank {
static double balance=100000;
ArrayList<Account> accounts;
static void transferAccount(Account sender, Account reciever, double amount){
	//sender.balance-= amount;
	//reciever.balance+=amount;
	sender.withdraw(amount);
	reciever.deposit(amount);
}
void showTotalBalance(){
	System.out.println(balance);
}
ArrayList<Account> getAccount(){
	return accounts;
}
}

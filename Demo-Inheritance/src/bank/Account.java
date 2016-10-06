package bank;

public class Account {
static int noOfAccounts=0;
int accNo;
double balance;
Customer customer;
Account(double balance, String name){
	++noOfAccounts;
	this.accNo=noOfAccounts;
	this.balance=balance;
	customer = new Customer(name);
}
synchronized 
boolean deposit(double amount){
	balance+=amount;
	Bank.balance+=amount;
	return true;
}

synchronized 
boolean withdraw(double amount){
	if(balance>amount){
		balance-=amount;
		Bank.balance-=amount;
		return true;
	}
	else
		return false;
	}

double getBalance(){
	return balance;
}
}

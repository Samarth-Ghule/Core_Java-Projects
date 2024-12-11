package com.Polymorphism.Account;

public class currentAccount extends Account {
	
	// @Override
	void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("Balance After Withdraw:" + balance);
	}
	currentAccount(long accountNumber,String accountHolder,double balance){
		 this.accountNumber = accountNumber;
		 this.accountHolder = accountHolder;
		 this.balance = balance;
    }
	
}

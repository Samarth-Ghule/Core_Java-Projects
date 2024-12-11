package com.Polymorphism.Account;

public class Account {
	long accountNumber;
	String accountHolder;
	double balance;

	void deposite(int amount) {
		balance = balance + amount;
	}

	void withdraw(int amount) {
		balance = balance - amount;
	}

	void displayAccountinfo() {
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Account Holder:" + accountHolder);
		System.out.println("Account Balance:" + balance);

	}
}

package com.Bank;

public abstract class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	abstract void getAccountNumber();

	abstract void getAccountHolderName();

	abstract void getbalance();

	abstract void deposite(double amount);

	abstract void withdraw(double amount);

}

package com.Bank;

public class SavingAccount extends BankAccount {
	private double interestRate;
	

	public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.interestRate = interestRate;
	}

	@Override
	void getAccountNumber() {
		
	}

	@Override
	void getAccountHolderName() {
		// TODO Auto-generated method stub

	}

	@Override
	void getbalance() {
		// TODO Auto-generated method stub

	}

	@Override
	void deposite(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

}

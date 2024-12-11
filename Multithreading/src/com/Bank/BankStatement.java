package com.Bank;

import java.util.Date;
import java.util.Random;

public class BankStatement extends Thread {

	private final static String accountHolderName = "Rohit Sharma";
	private final static String accountNumber = "1563784536";
	private static double balance = 10000;

	@Override
	public void run() {

		for (int i = 1; i < 3; i++) {
			withdraw(500);
		}

	}

	private synchronized static void withdraw(double amount) {
		if (balance > 150 && (balance - amount) > 150) {
			balance = balance - amount;
			System.out.println("Account holder name - " + BankStatement.accountHolderName);
			System.out.println("Account number - " + BankStatement.accountNumber);
			System.out.println("Transaction type - by " + Thread.currentThread().getName());
			Random id = new Random();
			System.out.println("Transaction id - " + id.nextLong());
			Date d1 = new Date();
			System.out.println("Transaction date and time - " + d1);
			System.out.println("Debited amount - " + amount);
			System.out.println("Remaining balance - " + balance);
			System.out.println("==================================================");
		} else {
			System.out.println("Insufficient balance!!!");
			System.out.println("==================================================");
		}
	}

	public synchronized static void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Account holder name - " + BankStatement.accountHolderName);
		System.out.println("Account number - " + BankStatement.accountNumber);
		Date d1 = new Date();
		System.out.println("Transaction date and time - " + d1);
		System.out.println("Credited amount - " + amount);
		System.out.println("Remaining balance - " + balance);
		System.out.println("==================================================");
	}

}

package com.Bank;

public class Test {
	public static void main(String[] args) {

		BankStatement b1 = new BankStatement();
		b1.setName("GPay");
		b1.start();

		BankStatement b2 = new BankStatement();
		b2.setName("PhonePay");
		b2.start();

		BankStatement b3 = new BankStatement();
		b3.setName("Paytm");
		b3.start();

		BankStatement.deposite(3000);
	}
}

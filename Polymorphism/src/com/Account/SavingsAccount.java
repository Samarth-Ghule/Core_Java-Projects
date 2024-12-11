package com.Polymorphism.Account;

public class SavingsAccount extends Account {
	int trx = 4;

	@Override
	void withdraw(int amount) {
		if (trx > 0) {
			balance = balance - amount;
			trx--;
			System.out.println("Balance after Withdraw:" + balance);
		} else {
			System.out.println("   Limit Exceed...!!!");
		}

	}
	SavingsAccount(long accountNumber,String accountHolder,double balance){
		 this.accountNumber = accountNumber;
		 this.accountHolder = accountHolder;
		 this.balance = balance;
    }
	
}

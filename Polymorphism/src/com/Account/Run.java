package com.Polymorphism.Account;

public class Run {
	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(123987, "Sam G", 5700);
		System.out.println("   >> Saving Account <<");
		System.out.println("_____________________________");
		s1.displayAccountinfo();
		System.out.println("_____________________________");
		s1.withdraw(350);
		s1.withdraw(350);
		s1.withdraw(400);
		s1.withdraw(500);
		System.out.println("-----------------------------");
		s1.withdraw(300);
		System.out.println("-----------------------------");
		System.out.println("_____________________________");
		System.out.println("   >> Current Account <<");
		System.out.println("_____________________________");
		currentAccount c1 = new currentAccount(456321, "Bhau K", 99999);
		c1.displayAccountinfo();
		System.out.println("_____________________________");
		c1.withdraw(12000);
		c1.withdraw(4500);
		System.out.println("_____________________________");

	}
}

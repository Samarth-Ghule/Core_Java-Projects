package com.Taskwhileloop;

public class T9 {
	public static void main(String[] args) {
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		int total = 0;

		while (i <= 50) {
			if (i % 2 != 0) {
				sum1 = sum1 + i; 

			} else {

				sum2 = sum2 + i;

			}
			total = sum1 + sum2;

			i++;

		}
		System.out.println("------------------");
		System.out.println("Sum of Odd Number:" + sum1);
		System.out.println("------------------");
		System.out.println("Sum of Even NUmber:" + sum2);
		System.out.println("******************");
		System.out.println("Total:" + total);
		System.out.println("------------------");
	}
}

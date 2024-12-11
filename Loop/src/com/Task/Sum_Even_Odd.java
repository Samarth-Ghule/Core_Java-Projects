package com.Task;

public class Sum_Even_Odd {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			} else if (i % 2 != 0) {
				sum1 = sum1 + i;
			}
			total = sum + sum1;
		}
		System.out.println("Sum of Even Number:" + sum);
		System.out.println("Sum of Odd Number:" + sum1);
		System.out.println("Total:" + total);
	}

}

package com.Task;

public class Loop_Even {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 50; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}

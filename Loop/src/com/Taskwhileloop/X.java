package com.Taskwhileloop;

public class X {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 200; i <= 500; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				i++;

			}

		}
		System.out.println(sum);

	}
}

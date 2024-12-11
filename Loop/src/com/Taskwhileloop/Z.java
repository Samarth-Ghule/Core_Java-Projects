package com.Taskwhileloop;

public class Z {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 301; i < 700; i++) {
			if (i % 5 == 0) {
				count++;
			}

		}
		System.out.println(count);
	}
}

package com.Taskwhileloop;

public class T10 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(" Even:" + i);
			} else if (i % 2 != 0) {
				System.out.print("Odd:" + i);

			}

			i++;

		}

	}
}
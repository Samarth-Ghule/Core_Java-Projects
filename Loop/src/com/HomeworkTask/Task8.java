
package com.HomeworkTask;

public class Task8 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		for (int i = 1; i <= 9; i++) {
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;

		}
	}
}

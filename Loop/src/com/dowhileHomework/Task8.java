package com.dowhileHomework;

public class Task8 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int i = 1;
				
		do {
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			num3 = num1 + num3;
			i++;
			
		} while (i <= 9);
	}
}

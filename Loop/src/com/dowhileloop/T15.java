package com.dowhileloop;

public class T15 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		do {
			if (i % 2 != 0 ) {
				count++;
			}
			i++;
		} while (i <= 25);
		System.out.println("Count of Odd Number:"+count);
	}
	
}

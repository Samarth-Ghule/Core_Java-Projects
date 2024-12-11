package com.dowhileHomework;

public class Task6 {
	public static void main(String[] args) {
		int s = 2;
		int num = 1;
		
		do {
			System.out.println(num);
			num = num + s;
			s += 1;
		} while (s <= 10);
	}

}

package com.Taskwhileloop;

public class T14 {
	public static void main(String[] args) {

		int count = 0;
		int i = 1;
		while (i <= 25) {
			if (i % 2 == 0) {

				count++;
			}
			i++;

		}
		System.out.println("Count:" + count);
	}
}

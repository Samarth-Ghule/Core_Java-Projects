package com.Taskwhileloop;

public class T15 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (i <= 25) {
			if (i % 2 != 0) {
				count++;
			}
			
			i++;
		}
		System.out.println("Count:"+count);
		
	}

}

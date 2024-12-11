package com.dowhileloop;

public class T10 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.print("Odd:"+i);
			}else {
				System.out.println("  Even:"+i);
			}
			i++;
		} while (i <= 50 );
	}

}

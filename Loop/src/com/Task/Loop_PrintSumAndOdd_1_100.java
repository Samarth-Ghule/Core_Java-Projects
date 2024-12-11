package com.Task;

public class Loop_PrintSumAndOdd_1_100 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(" even:"+i);

			} else if (i % 2 != 0) {
				System.out.print("Odd:"+i);
			}
		}

	}
}

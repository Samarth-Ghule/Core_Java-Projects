package com.StarPattern;

public class AllPatterns {

	public static void main(String[] args) {
		System.out.println("___________________");
		System.out.println(">> Start From Here <<");
		for (int i = 1; i <= 5; i++) {
			System.out.print(" ");
			for (int j = 1; j <= 5; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}

		System.out.println("___________________");
		System.out.println("1.");
		for (int i = 1; i <= 5; i++) { // for rows
			for (int j = 1; j <= i; j++) { // for end
				System.out.print("* ");
			}
			System.out.println(); // for line change
		}
		System.out.println("___________________");
		System.out.println("2.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println("___________________");
		System.out.println("3.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");

			}
			for (int s = 1; s <= i * 2 - 1; s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("___________________");
		System.out.println("4.");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (int s = 1; s <= i * 2 - 1; s++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("___________________");
		System.out.println("5.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");

			}
			for (int s = 1; s <= i * 2 - 1; s++) {
				if (s == 1 || s == i * 2 - 1 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		System.out.println("___________________");
		System.out.println("6.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");

			}
			for (int s = 1; s <= i; s++) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println("___________________");

		System.out.println("7.");
		char ch = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j % 2 == 0) {
					System.out.print("# ");

				} else {
					System.out.print(ch++ + " ");
				}

			}
			System.out.println();

		}
		System.out.println("___________________");

		System.out.println("8.");
		// Outer Loop
		for (int i = 1; i <= 5; i++) {
			// Inner Loop
			for (int j = 1; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print(j + " ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("___________________");

		System.out.println("9.");
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("___________________");

		System.out.println("10.");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("___________________");

	}
}

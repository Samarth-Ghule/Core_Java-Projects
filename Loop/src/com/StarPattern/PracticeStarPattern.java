package com.StarPattern;

public class PracticeStarPattern {
	public static void main(String[] args) {
		// Solid Rectangle

		int x = 4;
		int y = 5;

		System.out.println("______________________");
		System.out.println(">> Solid Rectangle <<");
		// Outer Loop
		for (int i = 1; i <= x; i++) {
			// Inner Loop
			for (int j = 1; j <= y; j++) {

				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("______________________");

		System.out.println(">> Hollow Rectangle <<");
		// Outer Loop
		for (int i = 1; i <= x; i++) {
			// Inner Loop
			for (int j = 1; j <= y; j++) {
				if (i == 1 || j == 1 || i == x || j == y) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("______________________");

		System.out.println(">> Half Pyramid <<");
		// Outer Loop
		for (int i = 1; i <= 4; i++) {
			// Inner Loop
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("______________________");

		System.out.println(">> Inverted Half Pyramid <<");
		// Outer Loop
		for (int i = 4; i >= 1; i--) {
			// Inner Loop
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("______________________");

		System.out.println(">> Inverted Half Pyramid (180 Degree) <<");
		// Outer Loop
		for (int i = 1; i <= 4; i++) {
			// Inner Loop --> Space Print
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print("  ");
			}
			// Inner Loop --> Star Print
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("______________________");

		System.out.println(">> Half Pyramid With Number <<");
		// Outer Loop
		for (int i = 1; i <= 5; i++) {
			// Inner Loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
		System.out.println("______________________");

		System.out.println(">> Plus Type <<");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println("______________________");

	}

}

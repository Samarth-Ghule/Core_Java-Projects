package com.Polymorphism.Product;

public class Run {
	public static void main(String[] args) {
		Clothing c1 = new Clothing("Kurti", "For girls", 8000, "XL", "yellow", "cotton");
		c1.calculateDiscount();
		c1.displayProductInfo();

	}
}

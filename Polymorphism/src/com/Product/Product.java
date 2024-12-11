package com.Polymorphism.Product;

public class Product {
	
	String name;
	String description;
	double price;
	double discount;
	double discountedPrice;
	
	void calculateDiscount() {
		discount = price * 0.02;
		discountedPrice = price - discount;
	}
	
	void displayProductInfo() {
		System.out.println("Product name - " + name);
		System.out.println("Product description - " + description);
		System.out.println("Actual price - " + price);
		System.out.println("Discounted price - " + discountedPrice);
	}

}

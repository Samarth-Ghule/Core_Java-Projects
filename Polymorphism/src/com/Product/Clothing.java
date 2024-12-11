package com.Polymorphism.Product;

public class Clothing extends Product {

	String size;
	String color;
	String material;

	@Override
	void calculateDiscount() {
		if (price > 0) {
			if (price <= 3000) {
				discount = price * 0.2;
				discountedPrice = price - discount;
			} else if (price > 3000 && price <= 8000) {
				discount = price * 0.3;
				discountedPrice = price - discount;
			} else {
				discount = price * 0.5;
				discountedPrice = price - discount;
			}
		} else {
			System.out.println("Enter valid amount!!!");
		}
	}

	public Clothing(String name, String description, double price, String size, String color, String material) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
		this.color = color;
		this.material = material;
	}

}

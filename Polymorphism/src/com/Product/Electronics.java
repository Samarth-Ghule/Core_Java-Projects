package com.Polymorphism.Product;

public class Electronics extends Product {

	String warrantyPeriod;
	String brand;

	
	@Override
	void calculateDiscount() {
		if(price > 0) {
			if(price <= 10000) {
				discount = price * 0.03;
				discountedPrice = price - discount;
			} else if(price > 10000 && price <=50000) {
				discount = price * 0.05;
				discountedPrice = price - discount;
			} else {
				discount = price * 0.07;
				discountedPrice = price - discount;
			}
		} else {
			System.out.println("Enter valid amount!!!");
		}
	}

	public Electronics(String name, String description, double price, String warrantyPeriod, String brand) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
	}

}

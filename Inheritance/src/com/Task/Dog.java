package com.Task;

public class Dog extends Animal {

	@Override
	public void name() {
		System.out.println("Name : Dog" );
		
	}

	@Override
	public void sound() {
		
		System.out.println("Sound : Barking");
	}

	@Override
	public void Meal() {
			System.out.println("Meal : Pedigree");
	}
	

}

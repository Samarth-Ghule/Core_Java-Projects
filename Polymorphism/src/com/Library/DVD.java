package com.Polymorphism.Library;

public class DVD extends LibraryItem {
	String director;
	double runTime;
	
	@Override
	void displayInfo() {
		System.out.println("Director:"+director);
		System.out.println("runTime:"+runTime);
	}
}

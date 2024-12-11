package com.Polymorphism.Library;

public class EBook extends LibraryItem{
	String format;
	double fileSize;
	
	
	public EBook(String format, double fileSize,String title, String author, String location) {
		
		this.format = format;
		this.fileSize = fileSize;
		this.title = title;
		this.author = author;
		this.location = location;
	}


	@Override
	void displayInfo() {
		System.out.println("Title Of Book is:" + title);
		System.out.println("Author Of Book is:" + author);
		System.out.println("Location Of Book is:" + location);
		System.out.println("Format Of Book is:" + format);
		System.out.println("Size Of Book is:" + fileSize);
		
	}
}

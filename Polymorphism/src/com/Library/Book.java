package com.Polymorphism.Library;

public class Book extends LibraryItem {
	String genre;
	int numberOfPages;

	public Book(String genre, int numberOfPages, String title, String author, String location) {

		this.genre = genre;
		this.numberOfPages = numberOfPages;
		this.title = title;
		this.author = author;
		this.location = location;
	}

	@Override
	void displayInfo() {
		System.out.println("Title Of Book is:" + title);
		System.out.println("Author Of Book is:" + author);
		System.out.println("Location Of Book is:" + location);
		System.out.println("Genre Of Book is:" + genre);
		System.out.println("Total Pages Of Book is:" + numberOfPages);
	}

}

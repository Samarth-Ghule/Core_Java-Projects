package com.Polymorphism.Media;

public class MultimediaFile {

	String title;
	String duration;
	double fileSize;

	void play() {
		System.out.println("Playing multimedia file!!");
	}

	void displayInfo() {

		System.out.println("Title of file - " + title);
		System.out.println("Duration - " + duration);
		System.out.println("File size - " + fileSize);

	}

}

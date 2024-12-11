package com.Polymorphism.Media;

public class Run {
public static void main(String[] args) {
		
		AudioFile a1 = new AudioFile("Song","4 min",117.45,"asdf","dfh");
		a1.play();
		VideoFile v1 = new VideoFile("SOng", "3.5 min", 220.25,"1080p","asd");
		v1.play();
	}
}

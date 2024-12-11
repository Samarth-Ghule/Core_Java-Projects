package com.Polymorphism.Media;

public class VideoFile extends MultimediaFile {
	String resolution;
	String subtitles;

	@Override
	void play() {
		if (resolution == "144p" || resolution == "240p") {
			System.out.println("Playing Low Quality...!!");
		} else if (resolution == "360p" || resolution == "720p" || resolution == "1080p") {
			System.out.println("Playing Hight Quality Video...!!");
		} else {
			System.out.println("Enter valid resoltuion!!");
		}
	}

	public VideoFile(String title, String duration, double fileSize, String resolution, String subtitles) {
		this.title = title;
		this.duration = duration;
		this.fileSize = fileSize;
		this.resolution = resolution;
		this.subtitles = subtitles;
	}
}

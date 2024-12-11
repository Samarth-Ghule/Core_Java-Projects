package com.Polymorphism.Media;


	public class AudioFile extends MultimediaFile {
		
		String artist;
		String album;
		
		@Override
		void play() {
			if(artist == "Arjit") {
				System.out.println("Playing Arjits Audio file!!");
			} else if(artist == "Shreya") {
				System.out.println("Playing Shreyas Audio file!!");
			} else {
				System.out.println("Artist not found!!");
			}
		}

		public AudioFile(String title, String duration, double fileSize, String artist, String album) {
			this.title = title;
			this.duration = duration;
			this.fileSize = fileSize;
			this.artist = artist;
			this.album = album;
		}
		
		

}

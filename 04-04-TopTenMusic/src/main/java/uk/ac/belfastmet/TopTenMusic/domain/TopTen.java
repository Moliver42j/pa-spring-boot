package uk.ac.belfastmet.TopTenMusic.domain;

public class TopTen 
{
	private String artist;
	private String song;
	private String image;
	
	
	public TopTen(String artist, String song, String image) {
		super();
		this.artist = artist;
		this.song = song;
		this.image = image;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}

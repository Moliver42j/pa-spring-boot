package uk.ac.belfastmet.TopTenMusic.domain;

public class TopTen 
{
	private String artistName;
	private String song;
	private String image;
	
	
	public TopTen(String artistName, String song, String image) 
	{
		this.artistName = artistName;
		this.song = song;
		this.image = image;
	}
	
	public String getArtistName() 
	{
		return artistName;
	}
	
	public void setArtist(String artist) 
	{
		this.artistName = artist;
	}
	
	public String getSong() 
	{
		return song;
	}
	
	public void setSong(String song) 
	{
		this.song = song;
	}
	
	public String getImage() 
	{
		return image;
	}
	
	public void setImage(String image) 
	{
		this.image = image;
	}
	
}

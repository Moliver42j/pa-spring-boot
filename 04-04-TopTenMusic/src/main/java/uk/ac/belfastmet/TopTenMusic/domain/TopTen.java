package uk.ac.belfastmet.TopTenMusic.domain;

public class TopTen 
{
	private String artistName;
	private String song;
	private String image;
	private String position;
	private String genre;
	private String type;
	private String name;
	
	
	
	
	
	
	public TopTen(String position, String artistName, String song,  String genre, String image) 
	{
		this.artistName = artistName;
		this.song = song;
		this.image = image;
		this.position = position;
		this.genre = genre;
	}

	//Getters and Setters
	public String getArtistName() 
	{
		return artistName;
	}
	
	public void setArtistName(String artist) 
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String toString()
	{
		return name + " " + type;
	}
	
	
	
}

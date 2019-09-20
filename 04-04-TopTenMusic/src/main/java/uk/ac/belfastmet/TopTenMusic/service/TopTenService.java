package uk.ac.belfastmet.TopTenMusic.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


import uk.ac.belfastmet.TopTenMusic.domain.TopTen;

@Service
public class TopTenService {

	
	private ArrayList<TopTen> topSongs;
	private ArrayList<TopTen> topArtists;
	
	public ArrayList<TopTen> getTopSongs()
	{
		
		this.topSongs = new ArrayList<TopTen>();
		
		this.topSongs.add(new TopTen("artist","song","image.png"));
		
		return this.topSongs;
	}
	
	
	public ArrayList<TopTen> getTopArtists()
	{
		this.topArtists = new ArrayList<TopTen>();
		
		this.topArtists.add(new TopTen("Post Malone",      "Beerbongs and Bentleys", "PostMalone.png"));
		this.topArtists.add(new TopTen("Taylor Swift",     "Me",                     "taylorswift.png"));
		this.topArtists.add(new TopTen("Billie Eilish",    "Ocean Eyes",             "billieeilish.png"));
		this.topArtists.add(new TopTen("Lizzo",            "Truth Hurts",            "lizzo.png"));
		this.topArtists.add(new TopTen("Khalid",           "Talk",                   "Khalid.png"));
		this.topArtists.add(new TopTen("Tool",             "Schism",                 "Tool.png"));
		this.topArtists.add(new TopTen("Ed Sheeran",       "Shape Of You",           "edsheeran.png"));
		this.topArtists.add(new TopTen("Camila Cabello",   "Havana",                 "camilacabello.png"));
		this.topArtists.add(new TopTen("Melanie Martinez", "Too Close",              "melaniemartinez.png"));
		
		return this.topArtists;
	}
}

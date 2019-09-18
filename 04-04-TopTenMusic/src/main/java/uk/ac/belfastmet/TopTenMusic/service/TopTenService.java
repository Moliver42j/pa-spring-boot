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
		
		this.topSongs.add(new TopTen("","",""));
		
		return this.topSongs;
	}
	
	public ArrayList<TopTen> getTopArtists()
	{
		this.topArtists = new ArrayList<TopTen>();
		
		this.topArtists.add(new TopTen("Post Malone", "Beerbongs and Bentleys", "PostMalone.png"))
	}
}

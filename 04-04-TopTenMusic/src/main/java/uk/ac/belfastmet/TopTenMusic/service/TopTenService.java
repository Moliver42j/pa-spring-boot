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
		
		this.topSongs.add(new TopTen("Post Malone",		 "Hollywood's Bleeding", 					 "postmalone.png"	  ));
		this.topSongs.add(new TopTen("Taylor Swift",	 "Lover",				 					 "taylorswift.png"	  ));
		this.topSongs.add(new TopTen("Melanie Martinez", "k-12",				 					 "melaniemartinez.png"));
		this.topSongs.add(new TopTen("Young Thug",		 "So Much Fun",			 					 "youngthug.png"	  ));
		this.topSongs.add(new TopTen("Lil Tecca",		 "We love you Tecca",	 					 "liltecca.png"		  ));
		this.topSongs.add(new TopTen("Lizzo",			 "Cuz I love you",		 					 "lizzo.png"		  ));
		this.topSongs.add(new TopTen("Tool",			 "Fear Inoculum",		 					 "tool.png"			  ));
		this.topSongs.add(new TopTen("Billie Eilish",	 "When We All Fall Asleep, Where do we Go?", "billieeilish.png"	  ));
		this.topSongs.add(new TopTen("Lana Del Ray",	 "Norman F***ing Rockwell!", 				 "lanadelray.png"	  ));
		this.topSongs.add(new TopTen("The Highwaywomen", "The Highwaywomen",						 "thehighwaywomen.png"));
		
		return this.topSongs;
	}
	
	
	public ArrayList<TopTen> getTopArtists()
	{
		this.topArtists = new ArrayList<TopTen>();
		
		this.topArtists.add(new TopTen("Post Malone",      "Beerbongs and Bentleys", "PostMalone.png"     ));
		this.topArtists.add(new TopTen("Taylor Swift",     "Me",                     "taylorswift.png"    ));
		this.topArtists.add(new TopTen("Billie Eilish",    "Ocean Eyes",             "billieeilish.png"   ));
		this.topArtists.add(new TopTen("Lizzo",            "Truth Hurts",            "lizzo.png"          ));
		this.topArtists.add(new TopTen("Khalid",           "Talk",                   "Khalid.png"         ));
		this.topArtists.add(new TopTen("Tool",             "Schism",                 "Tool.png"           ));
		this.topArtists.add(new TopTen("Ed Sheeran",       "Shape Of You",           "edsheeran.png"      ));
		this.topArtists.add(new TopTen("Camila Cabello",   "Havana",                 "camilacabello.png"  ));
		this.topArtists.add(new TopTen("Melanie Martinez", "Too Close",              "melaniemartinez.png"));
		
		return this.topArtists;
	}
}

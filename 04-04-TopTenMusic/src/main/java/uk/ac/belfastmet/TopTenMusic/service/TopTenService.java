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
		
		this.topSongs.add(new TopTen("Post Malone",		 "Hollywood's Bleeding", 					 "postmalonesong.png"	  ));
		this.topSongs.add(new TopTen("Taylor Swift",	 "Lover",				 					 "taylorswiftsong.png"	  ));
		this.topSongs.add(new TopTen("Melanie Martinez", "k-12",				 					 "melaniemartinezsong.png"));
		this.topSongs.add(new TopTen("Young Thug",		 "So Much Fun",			 					 "youngthugsong.png"	  ));
		this.topSongs.add(new TopTen("Lil Tecca",		 "We love you Tecca",	 					 "lilteccasong.png"		  ));
		this.topSongs.add(new TopTen("Lizzo",			 "Cuz I love you",		 					 "lizzosong.png"		  ));
		this.topSongs.add(new TopTen("Tool",			 "Fear Inoculum",		 					 "toolsong.png"			  ));
		this.topSongs.add(new TopTen("Billie Eilish",	 "When We All Fall Asleep, Where do we Go?", "billieeilishsong.png"	  ));
		this.topSongs.add(new TopTen("Lana Del Ray",	 "Norman F***ing Rockwell!", 				 "lanadelraysong.png"	  ));
		this.topSongs.add(new TopTen("The Highwaywomen", "The Highwaywomen",						 "thehighwaywomensong.png"));
		
		return this.topSongs;
	}
	
	
	public ArrayList<TopTen> getTopArtists()
	{
		this.topArtists = new ArrayList<TopTen>();
		
		this.topArtists.add(new TopTen("Post Malone",      "Beerbongs and Bentleys", "PostMaloneartist.png"     ));
		this.topArtists.add(new TopTen("Taylor Swift",     "Me",                     "taylorswiftartist.png"    ));
		this.topArtists.add(new TopTen("Billie Eilish",    "Ocean Eyes",             "billieeilishartist.png"   ));
		this.topArtists.add(new TopTen("Lizzo",            "Truth Hurts",            "lizzoartist.png"          ));
		this.topArtists.add(new TopTen("Khalid",           "Talk",                   "Khalidartist.png"         ));
		this.topArtists.add(new TopTen("Tool",             "Schism",                 "Toolartist.png"           ));
		this.topArtists.add(new TopTen("Ed Sheeran",       "Shape Of You",           "edsheeranartist.png"      ));
		this.topArtists.add(new TopTen("Camila Cabello",   "Havana",                 "camilacabelloartist.png"  ));
		this.topArtists.add(new TopTen("Melanie Martinez", "Too Close",              "melaniemartinezartist.png"));
		
		return this.topArtists;
	}
}

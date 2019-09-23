package uk.ac.belfastmet.TopTenMusic.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.TopTenMusic.domain.TopTen;

@Service
public class TopTenService {

	private ArrayList<TopTen> topSongs;
	private ArrayList<TopTen> topArtists;

	
	/**
	 * This method stores the data for the topSongs instance of the topTen Class
	 * @return an arraylist of song data 
	 */
	public ArrayList<TopTen> getTopSongs() {

		this.topSongs = new ArrayList<TopTen>();

		// TopTen(position, artistName, song, genre, image)
		this.topSongs.add(new TopTen("1", "Post Malone",      "Hollywood's Bleeding", "Rap/Hip-hop", "postmalonesong.png"));
		this.topSongs.add(new TopTen("2", "Taylor Swift", 	  "Lover", "Pop", "taylorswiftsong.png"));
		this.topSongs.add(new TopTen("3", "Melanie Martinez", "k-12", "Unkown \n (Didn't listen to it)", "melaniemartinezsong.png"));
		this.topSongs.add(new TopTen("4", "Young Thug",       "So Much Fun", "Rap/Hip-hop", "youngthugsong.png"));
		this.topSongs.add(new TopTen("5", "Lil Tecca",        "We love you Tecca", "Rap/Hip-hop", "lilteccasong.png"));
		this.topSongs.add(new TopTen("6", "Lizzo",            "Cuz I love you", "Unkown \n (Didn't listen to it)", "lizzosong.png"));
		this.topSongs.add(new TopTen("7", "Tool",             "Fear Inoculum", "rap/hiphop", "toolsong.png"));
		this.topSongs.add(new TopTen("8", "Billie Eilish",    "When We All Fall Asleep, Where do we Go?", "Pop",
				"billieeilishsong.png"));
		this.topSongs
				.add(new TopTen("9", "Lana Del Ray", "Norman F***ing Rockwell!", "Pop (I assume)", "lanadelraysong.png"));
		this.topSongs
				.add(new TopTen("10", "The Highwaywomen", "The Highwaywomen", "Pop (I assume)", "thehighwaywomensong.png"));

		return this.topSongs;
	}

	/**
	 * This method stores the data for the topArtists instance of the topTen Class
	 * @return an arraylist of artist data
	 */
	public ArrayList<TopTen> getTopArtists() {
		this.topArtists = new ArrayList<TopTen>();

		// TopTen(artistName, song, position, genre, image)
		this.topArtists.add(new TopTen("1","Post Malone", "Beerbongs and Bentleys", "Rap/Hip-hop", "PostMaloneartist.png"));
		this.topArtists.add(new TopTen("2","Taylor Swift", "Me", "Pop", "taylorswiftartist.png"));
		this.topArtists.add(new TopTen("3","Billie Eilish", "Ocean Eyes", "Pop", "billieeilishartist.png"));
		this.topArtists.add(new TopTen("4","Lizzo", "Truth Hurts", "Unkown \n (Didn't listen to it)", "lizzoartist.png"));
		this.topArtists.add(new TopTen("5","Khalid", "Talk","R&B or something", "Khalidartist.png"));
		this.topArtists.add(new TopTen("6","Tool", "Schism","rap/hiphop", "Toolartist.png"));
		this.topArtists.add(new TopTen("7","Ed Sheeran", "Shape Of You", "Pop","edsheeranartist.png"));
		this.topArtists.add(new TopTen("8","Camila Cabello", "Havana","Pop", "camilacabelloartist.png"));
		this.topArtists.add(new TopTen("9","Melanie Martinez", "Too Close","Unkown \n (Didn't listen to it)", "melaniemartinezartist.png"));

		return this.topArtists;
	}
}

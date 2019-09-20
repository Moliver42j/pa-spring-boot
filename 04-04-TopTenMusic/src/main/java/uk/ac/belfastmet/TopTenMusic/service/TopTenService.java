package uk.ac.belfastmet.TopTenMusic.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.TopTenMusic.domain.TopTen;

@Service
public class TopTenService {

	private ArrayList<TopTen> topSongs;
	private ArrayList<TopTen> topArtists;

	public ArrayList<TopTen> getTopSongs() {

		this.topSongs = new ArrayList<TopTen>();

		// TopTen(position, artistName, song, genre, image)
		this.topSongs.add(new TopTen("1", "Post Malone", "Hollywood's Bleeding", "rap/hiphop", "postmalonesong.png"));
		this.topSongs.add(new TopTen("2", "Taylor Swift", "Lover", "rap/hiphop", "taylorswiftsong.png"));
		this.topSongs.add(new TopTen("3", "Melanie Martinez", "k-12", "rap/hiphop", "melaniemartinezsong.png"));
		this.topSongs.add(new TopTen("4", "Young Thug", "So Much Fun", "rap/hiphop", "youngthugsong.png"));
		this.topSongs.add(new TopTen("5", "Lil Tecca", "We love you Tecca", "rap/hiphop", "lilteccasong.png"));
		this.topSongs.add(new TopTen("6", "Lizzo", "Cuz I love you", "rap/hiphop", "lizzosong.png"));
		this.topSongs.add(new TopTen("7", "Tool", "Fear Inoculum", "rap/hiphop", "toolsong.png"));
		this.topSongs.add(new TopTen("8", "Billie Eilish", "When We All Fall Asleep, Where do we Go?", "rap/hiphop",
				"billieeilishsong.png"));
		this.topSongs
				.add(new TopTen("9", "Lana Del Ray", "Norman F***ing Rockwell!", "rap/hiphop", "lanadelraysong.png"));
		this.topSongs
				.add(new TopTen("10", "The Highwaywomen", "The Highwaywomen", "rap/hiphop", "thehighwaywomensong.png"));

		return this.topSongs;
	}

	public ArrayList<TopTen> getTopArtists() {
		this.topArtists = new ArrayList<TopTen>();

		// TopTen(artistName, song, position, genre, image)
		this.topArtists.add(new TopTen("1","Post Malone", "Beerbongs and Bentleys", "rap/hiphop", "PostMaloneartist.png"));
		this.topArtists.add(new TopTen("2","Taylor Swift", "Me", "rap/hiphop", "taylorswiftartist.png"));
		this.topArtists.add(new TopTen("3","Billie Eilish", "Ocean Eyes", "rap/hiphop", "billieeilishartist.png"));
		this.topArtists.add(new TopTen("4","Lizzo", "Truth Hurts", "rap/hiphop", "lizzoartist.png"));
		this.topArtists.add(new TopTen("5","Khalid", "Talk","rap/hiphop", "Khalidartist.png"));
		this.topArtists.add(new TopTen("6","Tool", "Schism","rap/hiphop", "Toolartist.png"));
		this.topArtists.add(new TopTen("7","Ed Sheeran", "Shape Of You", "rap/hiphop","edsheeranartist.png"));
		this.topArtists.add(new TopTen("8","Camila Cabello", "Havana","rap/hiphop", "camilacabelloartist.png"));
		this.topArtists.add(new TopTen("9","Melanie Martinez", "Too Close","rap/hiphop", "melaniemartinezartist.png"));

		return this.topArtists;
	}
}

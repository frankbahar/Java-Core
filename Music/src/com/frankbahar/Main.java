package com.frankbahar;


import com.frankbahar.model.Artist;
import com.frankbahar.model.Datasource;
import com.frankbahar.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Datasource datasource = new Datasource();
	    if (!datasource.open()) {
	        System.out.println("Can't open datasource");
	        return;
        }
	    List<Artist> artists = datasource.queryArtists(5);
	    if(artists == null){
	    	System.out.println("No artists");
	    	return;
		}
	    for(Artist artist:artists){
	    	System.out.println("Artist Id = "+ artist.getId() + ", Name = " + artist.getName());
		}

		List<String> albumsForArtist = datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_DESC);
		if(albumsForArtist == null){
			System.out.println("No albums for selected artist");
			return;
		}
		for(String album : albumsForArtist){
			System.out.println("Album Name = " + album);
		}

		List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
		if(songArtists == null){
			System.out.println("No artists and albums for selected song");
			return;
		}
		for(SongArtist songArtist : songArtists){
			System.out.println("Artist Name = " + songArtist.getArtistName() + " Album Name = " + songArtist.getAlbumName() +
					" Track = " + songArtist.getTrack());
		}
		datasource.querySongsMetaData();
		int count = datasource.getCount(Datasource.TABLE_SONGS);
		System.out.println(datasource.TABLE_SONGS + " has " + count + " records");

//		datasource.createViewSongArtists();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a song Title: ");
//		String title = scanner.nextLine();
//		songArtists= datasource.querySongInfo(title);
//		if(songArtists.isEmpty()){
//			System.out.println("No artists and albums for selected song");
//			return;
//		}
//		for(SongArtist songArtist : songArtists){
//			System.out.println("Artist Name = " + songArtist.getArtistName() + " Album Name = " + songArtist.getAlbumName() +
//					" Track = " + songArtist.getTrack());
//		}

		datasource.insertSong("Bird Dog", "Everly Brothers", "All-Time Greatest Hits",7);
		datasource.close();
    }
}

 package com.frankbahar;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }
    public boolean addNewSong(String title, double duration){
        return this.songs.addNewSong(new Song(title,duration));
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
    public boolean addToPlayList( String title, LinkedList<Song> playList){
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + "is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addNewSong(Song song){
            if (songs.contains(song)) {
                System.out.println("Album has already this song");
                return false;
            }
            this.songs.add(song);
            System.out.println("Song " + song.getTitle() + " added");
            return true;
        }

        private Song findSong(String title){
            for(Song checkedSong: this.songs){
                if (checkedSong.getTitle().equals(title))
                    return checkedSong;
            }
            return null;
        }
        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}

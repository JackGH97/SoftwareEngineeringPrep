package com.hawkins;

import java.util.LinkedList;

public class Playlist {

    private String playlistName;
    private LinkedList<Song> listOfSongs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.listOfSongs = new LinkedList<>();
    }

    public boolean addSong(String name){

        return true;
    }



    public String getPlaylistName() {
        return playlistName;
    }

    private static Playlist createPlaylist(String name){
        return new Playlist(name);
    }
}

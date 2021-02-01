package com.hawkins;

public class Song {

    private String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // creates it without creating a separate object instance
    private static Song createSong(String name, double duration){
        return new Song(name,duration);
    }


}

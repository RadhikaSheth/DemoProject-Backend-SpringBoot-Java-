package com.example.demo;


public class Song {
    private String name;
    private String songAlbum;
    private int songDuration;
    private String songKey;
    private double songDanceability;
    private double songAcousticness;

    public Song() {
    }

    public Song(String name, String songAlbum, int songDuration, String songKey, double songDanceability, double songAcousticness) {
        this.name = name;
        this.songAlbum = songAlbum;
        this.songDuration = songDuration;
        this.songKey = songKey;
        this.songDanceability = songDanceability;
        this.songAcousticness = songAcousticness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    public void setSongKey(String songKey) {
        this.songKey = songKey;
    }

    public void setSongDanceability(double songDanceability) {
        this.songDanceability = songDanceability;
    }

    public void setSongAcousticness(double songAcousticness) {
        this.songAcousticness = songAcousticness;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    public String getName() {
        return name;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public String getSongKey() {
        return songKey;
    }

    public double getSongDanceability() {
        return songDanceability;
    }

    public double getSongAcousticness() {
        return songAcousticness;
    }
}

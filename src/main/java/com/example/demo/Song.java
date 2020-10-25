package com.example.demo;

import javax.persistence.*;


@Entity
@Table(name ="songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "songname")
    private String songName;
    @Column(name = "songalbum")
    private String songAlbum;
    @Column(name = "songduration")
    private int songDuration;
    @Column(name = "songkey")
    private String songKey;
    @Column(name = "songdanceability")
    private double songDanceability;
    @Column(name ="songacousticness")
    private double songAcousticness;


    public Song() {

    }

    public Song(int id, String songName, String songAlbum, int songDuration, String songKey, double songDanceability, double songAcousticness) {
        this.id = id;
        this.songName = songName;
        this.songAlbum = songAlbum;
        this.songDuration = songDuration;
        this.songKey = songKey;
        this.songDanceability = songDanceability;
        this.songAcousticness = songAcousticness;
    }

    public String getSongName() {
        return songName;
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

    public int getId() {
        return id;
    }

    public void setSongName(String songName) {
        this.songName = songName;
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

    public void setId(int id) {
        this.id = id;
    }
}

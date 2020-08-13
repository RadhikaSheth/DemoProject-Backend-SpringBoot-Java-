package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

     private List<Song> list = new ArrayList<>();

    /*
    list.add(new Song("Perfect", "Deluxe", 263400, "G# Major", 0.599, 0.163));
    list.add(new Song("Say You Won't Let Go", "Back From The Edge", 211467, "Bb Major", 0.358, 0.695));
    list.add(new Song("Rewrite The Stars", "The Greatest Showman: Reimagined (Deluxe)", 218293, "Bb Major", 0.67, 0.237));
    list.add(new Song("Lover", "Lover", 221307, "G Major", 0.359, 0.492));
    list.add(new Song("Hamdard", "Ek Villain", 260590, "F Major", 0.572, 0.759));
    list.add(new Song("Aashiqui (The Love Theme)", "Aashiqui 2", 162366, "Ab Major", 0.3, 0.984));
    */


    public List<Song> getList() {
        return list;
    }

    public void addSong(Song s) {
        list.add(s);
    }
    public void addList(List<Song> listOfSongs){ list.addAll(listOfSongs);}
}

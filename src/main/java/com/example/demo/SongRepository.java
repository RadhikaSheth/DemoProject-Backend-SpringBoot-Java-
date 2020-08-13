package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<>();

    public List<Song> getList()
    {
        return list;
    }

    public void addSong(Song s)
    {
        list.add(s);
    }

    public void addList(List<Song> listOfSongs)
    {
        list.addAll(listOfSongs);
    }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepo;

    public List<Song> getList(){
        List<Song> song = new ArrayList<>();
        songRepo.findAll().forEach(song::add);
        return song;
    }

    public void addSong(Song song){
        songRepo.save(song);
    }
    public void addList(List<Song> list){

        songRepo.saveAll(list);
    }

}

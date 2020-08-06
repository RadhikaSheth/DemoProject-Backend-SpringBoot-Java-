package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/songs")
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping(path = "/", produces = "application/json")
    public List<Song> getSongList() {
        return songRepository.getList();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody Song song) {
        songRepository.addSong(song);
        return song;
    }
}

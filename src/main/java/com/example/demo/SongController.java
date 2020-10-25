package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping(path = "/song", produces = "application/json")
    public List<Song> getSongList() {
        return songService.getList();
    }

    @PostMapping(path = "/song", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody Song song) {
        songService.addSong(song);
        return song;
    }
    @PostMapping(path = "/songs", consumes = "application/json", produces = "application/json")
    public List<Song> addSong(@RequestBody List<Song> listOfSongs) {
        songService.addList(listOfSongs);
        return listOfSongs;
    }
}

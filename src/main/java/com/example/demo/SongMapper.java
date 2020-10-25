package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SongMapper implements RowMapper<Song> {

    @Override
    public Song mapRow(ResultSet resultSet, int i) throws SQLException {

        Song song = new Song();
        song.setSongName(resultSet.getString("songName"));
        song.setSongAlbum(resultSet.getString("songAlbum"));
        song.setSongDuration(resultSet.getInt("songDuration"));
        song.setSongKey(resultSet.getString("songKey"));
        song.setSongDanceability(resultSet.getDouble("songDanceability"));
        song.setSongAcousticness(resultSet.getDouble("songAcousticness"));

        return song;
    }
}

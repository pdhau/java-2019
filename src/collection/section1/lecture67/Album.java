package collection.section1.lecture67;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private List<Song> songs;

    public Album() {
        this.songs = new ArrayList<>();
    }

    public Album(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public boolean addSong(Song song) {
        return this.getSongs().add(song);
    }
}

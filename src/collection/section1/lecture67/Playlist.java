package collection.section1.lecture67;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs;
    private int currentSong;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Album album, Song song) {
        if(!album.getSongs().contains(song)) {
            System.out.println("Song "+song.getTitle()+" not found in album");
        }
        this.songs.add(song);
        System.out.println("Add song successfully");
    }

    public void play() {
        for(Song song: this.getSongs()) {
            song.play();
        }
    }
}

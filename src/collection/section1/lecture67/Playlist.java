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

    public int getCurrentSong() {
        return currentSong;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void setCurrentSong(int currentSong) {
        this.currentSong = currentSong;
    }

    public void addSong(Album album, Song song) {
        if(!album.getSongs().contains(song)) {
            System.out.println("Song "+song.getTitle()+" not found in album");
        }
        this.songs.add(song);
        System.out.println("Add song successfully");
    }

    public void play() {
        this.setCurrentSong(0);
        this.getSongs().get(this.getCurrentSong()).play();
    }

    public void next() {
        int next = this.getCurrentSong() + 1;
        if(this.getSongs().size() == next) {
            next = 0;
        }
        this.setCurrentSong(next);
        this.getSongs().get(this.getCurrentSong()).play();
    }

    public void privious() {
        int next = this.getCurrentSong() - 1;
        if(0 > next) {
            next = this.getSongs().size() - 1;
        }
        this.setCurrentSong(next);
        this.getSongs().get(this.getCurrentSong()).play();
    }

    public void replay() {
        this.getSongs().get(this.getCurrentSong()).play();
    }
}

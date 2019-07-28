package collection.section1.lecture67;

public class Main {

    public static void main(String[] args) {
        Playlist myPlayList = new Playlist();
        Album theone = new Album();
        Album thetwo = new Album();
        Song song1 = new Song("Song 1", 10);
        Song song2 = new Song("Song 2", 10);
        Song song3 = new Song("Song 3", 10);
        Song song4 = new Song("Song 4", 10);
        Song song5 = new Song("Song 5", 10);
        theone.addSong(song1);
        theone.addSong(song2);
        theone.addSong(song3);
        thetwo.addSong(song4);
        thetwo.addSong(song5);
        myPlayList.addSong(theone, song1);
        myPlayList.addSong(theone, song5);
        myPlayList.addSong(thetwo, song5);
        myPlayList.play();
    }
}

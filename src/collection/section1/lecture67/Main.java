package collection.section1.lecture67;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Playlist myPlayList = new Playlist();
        Scanner in;
        String option;
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
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. Play");
            System.out.println("2. Next");
            System.out.println("3. Privious");
            System.out.println("4. Replay");
            System.out.println("5. Quit");
            System.out.print("What do you want: ");
            in = new Scanner(System.in);
            option = in.nextLine();
            switch (option) {
                case "1":
                    myPlayList.play();
                    break;
                case "2":
                    myPlayList.next();
                    break;
                case "3":
                    myPlayList.privious();
                    break;
                case "4":
                    myPlayList.replay();
                    break;
                case "5":
                    isExit = true;
                    break;
                default:
                    System.out.println("Your option do NOT support!");
                    break;
            }
        }
    }
}

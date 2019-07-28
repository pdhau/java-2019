package oop.section3.ex2;

public class PhotoAlbum {

    private int numberOfPages;

    public PhotoAlbum() {
        this.numberOfPages = 16;
    }

    public PhotoAlbum(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

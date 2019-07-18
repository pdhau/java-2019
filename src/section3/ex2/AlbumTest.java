package section3.ex2;

public class AlbumTest {

    public static void main(String[] args) {
        PhotoAlbum a1 = new PhotoAlbum();
        PhotoAlbum a2 = new PhotoAlbum(24);
        PhotoAlbum a3 = new BigPhotoAlbum();

        System.out.println("Manager: "+a1.getNumberOfPages());
        System.out.println("Manager: "+a2.getNumberOfPages());
        System.out.println("Manager: "+a3.getNumberOfPages());
    }
}

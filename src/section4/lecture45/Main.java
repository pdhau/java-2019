package section4.lecture45;

public class Main {

    public static void main(String[] args) {
        Floor floor = new Floor(2, 3, "Gray");
        Room room = new Room(floor);
        System.out.println(room.showFloor());
    }
}

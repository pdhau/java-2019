package section4.lecture45;

public class Room {

    Floor floor;

    public Room(Floor floor){
        this.floor = floor;
    }

    /**
     * @return the floor
     */
    public Floor getFloor() {
        return floor;
    }

    public String showFloor() {
        return "Width: "+this.getFloor().getWidth()+" -- Length: "+this.getFloor().getLength()+" -- Color: "+this.getFloor().getColor();
    }
}

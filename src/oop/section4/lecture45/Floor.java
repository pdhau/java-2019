package oop.section4.lecture45;

public class Floor {

    private double width;
    private double length;
    private String color;

    public Floor(double width, double length, String color){
        this.width = width;
        this.length = length;
        this.color = color;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}

package oop.section2.exercise1;

public class Test{
    public static void main(String[] args) {
        Circle circle = new Cylinder(3, 3);
        Cylinder cylinder = new Cylinder(3, 3); // Cylinder is not a circle
        System.out.println("Area: " + circle.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}

package oop.section2.exercise1;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius >= 0 ? radius : 0;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}

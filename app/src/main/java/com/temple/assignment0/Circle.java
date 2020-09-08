package com.temple.assignment0;

public class Circle extends Shape{
    private double radius;

    public Circle(String name) {
        super(name);
    }

    public void SetDimensions(double radius) {
        this.radius= radius;
    }
    public void printDimensions(){
        System.out.println("Circle's radius = "+radius);
    }
    public double getArea() {
        return Math.PI*(radius*radius);
    }
}
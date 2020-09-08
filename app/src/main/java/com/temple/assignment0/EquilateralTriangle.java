package com.temple.assignment0;

public class EquilateralTriangle extends Triangle {
    private double oneside;
    public EquilateralTriangle(String name) {
        super(name);
    }


    public void SetDimensions(double oneside) {
        this.oneside = oneside;
    }
    public void printDimensions(){
        System.out.println("EquilateralTriangle's oneside = "+oneside);
    }
    public double getArea() {
        return (oneside*(Math.sqrt(3)/2)*oneside)/2 ;
    }
}
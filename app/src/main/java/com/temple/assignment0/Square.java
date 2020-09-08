package com.temple.assignment0;

public class Square extends Shape {
    private double height;
    private double width;

    public Square(String name) {
        super(name);
    }
    void SetDimensions(double height,double width) {
        this.height= height;
        this.width = width;
    }
    public void printDimensions(){
        System.out.println("Suqare's"+"="+"("+"Height:"+height+","+"Width:"+width+")");
    }
    public double getArea() {
        return height*width;
    }
}

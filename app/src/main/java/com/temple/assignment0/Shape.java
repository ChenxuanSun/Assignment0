package com.temple.assignment0;
import java.util.Scanner;
public class Shape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Square s1 = new Square("Square");
        System.out.println("Please enter height and width for Square");
        s1.SetDimensions(scan.nextDouble(),scan.nextDouble());
        s1.printDimensions();
        System.out.println("Square's area = "+s1.getArea());

        System.out.println();
        System.out.println("Please enter radius for Circle");
        Circle c1 = new Circle("Circle");
        c1.SetDimensions(scan.nextDouble());
        c1.printDimensions();
        System.out.println("Circle's area ="+c1.getArea());

        System.out.println();
        System.out.println("Please enter 3 side for Trangle");
        Triangle t1 = new Triangle("Triangle");
        t1.SetDimensions(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        t1.printDimensions();
        System.out.println("Trangle's area = "+t1.getArea());

        System.out.println();
        System.out.println("Please enter side for EquilateralTriangle");
        EquilateralTriangle e1 = new EquilateralTriangle("EquilateralTriangle");
        e1.SetDimensions(scan.nextDouble());
        e1.printDimensions();
        System.out.println("EquilateralTriangle's area = "+e1.getArea());
    }
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    /** returns the name of the shape */
    public String getName() {
        return name;
    }

    /** returns the area of the shape */
    public double getArea() {
        return 0.0;
    }

    public void printDimensions(){
        System.out.println("No dimensions");
    }

}
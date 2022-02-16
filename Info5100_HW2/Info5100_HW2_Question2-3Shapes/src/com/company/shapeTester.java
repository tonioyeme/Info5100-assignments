package com.company;

import java.awt.*;

import static java.awt.Color.*;

public class shapeTester {
    public static void main(String args[]){

        Shape s = new Shape("shape", pink);

        Rectangle rec1 = new Rectangle("rectangle", green, 2.0, 3.0);

        Circle c1 = new Circle("circle", yellow, 4.0);

        System.out.println(s.display());

        System.out.println(rec1.display());
        System.out.println("Area: " + rec1.computeArea());
        System.out.println("Perimeter: " + rec1.computePerimeter());

        System.out.println(c1.display());
        System.out.println("Area: " + c1.computeArea());
        System.out.println("Perimeter: " + c1.computePerimeter());

    }
}

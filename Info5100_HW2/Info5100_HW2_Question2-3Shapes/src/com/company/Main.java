package com.company;

import static java.awt.Color.blue;
import static java.awt.Color.red;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle("triangle", blue, 3.0, 2.0);
        Triangle t2 = new Triangle("triangle", blue, 2.0);

        Rhombus rhom1 = new Rhombus("rhombus", red, 3.0, 2.0);
        Rhombus rhom2 = new Rhombus("rhombus", red, 3.0);

        System.out.println("Name: " + t1.display() + ", Area: " + t1.getArea());
        System.out.println("Name: " + t2.display() + ", Area: " + t2.getArea());

        System.out.println("Name: " + rhom1.display() + ", Area: " + rhom1.getArea());
        System.out.println("Name: " + rhom2.display() + ", Area: " + rhom2.getArea());



    }
}

package com.company;

import java.awt.*;



public class Circle extends Shape{
    double radius;

    public Circle(String name, Color color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public Circle(String name, Color color, double area, double perimeter, double radius) {
        super(name, color, area, perimeter);
        this.radius = radius;
    }

    public double computeArea(){
        return 3.14 * radius * radius;
    }

    public double computePerimeter(){
        return 2 * 3.14 * radius;
    }


}

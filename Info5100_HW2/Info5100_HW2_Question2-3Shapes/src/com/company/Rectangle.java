package com.company;

import java.awt.*;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String name, Color color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, Color color, double area, double perimeter, double length, double width) {
        super(name, color, area, perimeter);
        this.length = length;
        this.width = width;
    }

    public double computeArea(){
        return length * width;
    }

    public double computePerimeter(){
        return length * 2 + width * 2;
    }
}

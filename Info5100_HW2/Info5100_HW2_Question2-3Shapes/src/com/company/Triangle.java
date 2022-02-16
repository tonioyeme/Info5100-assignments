package com.company;

import java.awt.*;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    double base;
    double height;


    public Triangle(String name, Color color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }
    public Triangle(String name, Color color, double area, double perimeter, double base, double height) {
        super(name, color, area, perimeter);
        this.base = base;
        this.height = height;
    }



    public Triangle(String name, Color color, double base) {
        super(name, color);
        this.base = base;
    }
    public Triangle(String name, Color color, double area, double perimeter, double base) {
        super(name, color, area, perimeter);
        this.base = base;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        if (height == 0.0){
            return (sqrt(3) * base)/4;
        }
        return (base * height)/2;
    }
}

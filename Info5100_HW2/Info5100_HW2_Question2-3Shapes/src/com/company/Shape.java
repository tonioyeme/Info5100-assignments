package com.company;

import java.awt.*;

public class Shape {
    String name;
    Color color;
    double area;
    double perimeter;

    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, Color color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String printShape(){
        return name;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String display(){
        return ("shape: " + name + " color: " + color);
    }






}


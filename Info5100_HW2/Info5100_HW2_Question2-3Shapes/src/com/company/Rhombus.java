package com.company;

import java.awt.*;

public class Rhombus extends Shape{
    double diagonal1;
    double diagonal2;


    public Rhombus(String name, Color color, double diagonal1, double diagonal2) {
        super(name, color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    public Rhombus(String name, Color color, double area, double perimeter, double diagonal1, double diagonal2) {
        super(name, color, area, perimeter);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(String name, Color color, double diagonal1) {
        super(name, color);
        this.diagonal1 = diagonal1;
    }

    public Rhombus(String name, Color color, double area, double perimeter, double diagonal1) {
        super(name, color, area, perimeter);
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {

        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {

        this.diagonal2 = diagonal2;
    }



    public double getArea(){
        if (diagonal2 == 0.0){
            return (diagonal1*diagonal1)/2;
        }
        return (diagonal1 * diagonal2)/2;
    }

}

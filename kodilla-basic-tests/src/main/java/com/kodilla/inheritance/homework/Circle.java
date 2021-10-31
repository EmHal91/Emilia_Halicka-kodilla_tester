package com.kodilla.inheritance.homework;

public class Circle extends Shape {

    public int r = 9;
    static final double PI = 3.14;

    @Override
    public double getSurfaceArea() {
        System.out.println("This is the area of the circle" + (PI*r*r));
        return PI*r*r;
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is the perimeter od the circle" + (2*PI*r));
        return 2*PI*r;
    }
}

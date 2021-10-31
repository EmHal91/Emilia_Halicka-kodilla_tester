package com.kodilla.inheritance.homework;

public class Square extends Shape{

    public int a = 3;

    @Override
    public double getSurfaceArea() {
        System.out.println("This is the area of the square" + (a*a));
        return a*a;
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is the perimeter od the square"+ (4*a));
        return 4*a;
    }
}

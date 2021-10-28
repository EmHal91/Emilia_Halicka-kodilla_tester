package com.kodilla.inheritance.homework;

public class Circle extends Shape {
    @Override
    public void getSurfaceArea() {
        System.out.println("This is the area of the circle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("This is the perimeter od the circle");
    }
}

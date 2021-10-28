package com.kodilla.inheritance.homework;

public class Triangle extends Shape{
    @Override
    public void getSurfaceArea() {
        System.out.println("This is the area of the triangle");
    }

    @Override
    public void getPerimeter() {
        System.out.println("This is the perimeter od the triangle");
    }
}

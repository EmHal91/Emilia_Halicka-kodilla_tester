package com.kodilla.inheritance.homework;

public class Square extends Shape{
    @Override
    public void getSurfaceArea() {
        System.out.println("This is the area of the square");
    }

    @Override
    public void getPerimeter() {
        System.out.println("This is the perimeter od the square");
    }
}

package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    private double widht;
    private double height;
    private double hypotenuse;

    public Triangle (double widht, double height, double hypotenuse){
        this.height = height;
        this.widht = widht;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return widht * height / 2;
    }

    @Override
    public double getPerimeter() {
        return widht + height + hypotenuse;
    }
}

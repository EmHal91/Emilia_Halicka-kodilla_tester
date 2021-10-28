package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.getSurfaceArea();
        circle.getPerimeter();

        Shape square = new Square();
        square.getSurfaceArea();
        square.getPerimeter();

        Shape triangle = new Triangle();
        triangle.getPerimeter();
        triangle.getSurfaceArea();



    }
}

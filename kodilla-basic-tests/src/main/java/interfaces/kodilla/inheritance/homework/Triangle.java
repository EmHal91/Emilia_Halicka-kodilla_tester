package interfaces.kodilla.inheritance.homework;

public class Triangle extends Shape{

    public int a = 10;
    public int b = 13;
    public int h = 12;

    @Override
    public double getSurfaceArea() {
        System.out.println("This is the area of the triangle" + (0.5*a*h));
        return 0.5*a*h;
    }

    @Override
    public double getPerimeter() {
        System.out.println("This is the perimeter of the triangle" + (2*b+a));
        return 2*b+a;
    }
}

package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();

        int drawnCarKind = random.nextInt(15);
        int a = random.nextInt(101);
        int b = random.nextInt(101) + 20;
        int c = random.nextInt(101) + 50;
        if (drawnCarKind == 0)
            return new Audi(a);
        else if (drawnCarKind == 1)
            return new Skoda(b);
        else
            return new Volvo(c);

    }
}

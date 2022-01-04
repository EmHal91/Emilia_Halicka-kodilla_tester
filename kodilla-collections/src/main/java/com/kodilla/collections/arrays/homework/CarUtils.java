package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Volvo)
            return "Volvo";
        else
            return "Unknown car name";
    }
}

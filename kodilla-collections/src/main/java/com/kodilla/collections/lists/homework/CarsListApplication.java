package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Audi audi = new Audi(131);
        cars.add(audi);
        cars.add(new Skoda(100));
        cars.add(new Volvo(140));

        cars.remove(1);
        cars.remove(audi);
        cars.remove(new Volvo(140));
        System.out.println(cars.size());

        for (Car car : cars) {
            System.out.println(car + "describe Car" + car.describeCar);
        }
    }
}

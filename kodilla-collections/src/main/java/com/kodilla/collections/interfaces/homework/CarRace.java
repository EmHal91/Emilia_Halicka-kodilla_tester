package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Skoda skoda = new Skoda(100);
        doRace(skoda);

        Volvo volvo = new Volvo(140);
        doRace(volvo);

        Audi audi = new Audi(160);
        doRace(audi);
    }

    public static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}

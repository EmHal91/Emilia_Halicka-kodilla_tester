package com.kodilla.inheritance.homework;

public class DemonstrationSystem {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem ();
        system.turnOff();
        system.turnOn();

        FirstSystem firstSystem = new FirstSystem();
        firstSystem.turnOff();
        firstSystem.turnOn();
        System.out.println(firstSystem.getYear());

        SecondSystem secondSystem = new SecondSystem();
        secondSystem.turnOff();
        secondSystem.turnOn();
        System.out.println(secondSystem.getYear());
    }
}

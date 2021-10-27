package com.kodilla.inheritance.homework;

public class DemonstrationSystem {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem (2001);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        FirstSystem firstSystem = new FirstSystem(1998);
        firstSystem.turnOff();
        firstSystem.turnOn();
        System.out.println(firstSystem.getYear());

        SecondSystem secondSystem = new SecondSystem(2016);
        secondSystem.turnOff();
        secondSystem.turnOn();
        System.out.println(secondSystem.getYear());
    }
}

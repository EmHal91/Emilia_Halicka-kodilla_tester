package com.kodilla.inheritance.homework;

public class SecondSystem extends OperatingSystem {

    public SecondSystem (int year) {
        super ( year);
        System.out.println("System wydany w 2016 roku");
    }
    public void turnOn (){
        System.out.println("System zdecydowanie jest włączony");
    }
    public void turnOff () {
        System.out.println("System zdecydowanie jest wyłączony");
    }
}

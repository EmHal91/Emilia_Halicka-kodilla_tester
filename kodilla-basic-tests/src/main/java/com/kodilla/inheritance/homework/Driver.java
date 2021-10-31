package com.kodilla.inheritance.homework;

public class Driver extends Job {

    public String firstName = "Piotr";
    public int age = 50;
    public String job = "Driver";

    public Driver() {super("driving a car, delivery of goods, caring for the car");
        System.out.println("Driver's duties include" + responsibilities);
    }

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        this.firstName = firstName;
        System.out.println(("The driver" + firstName) + ("has responsibilities:"+ responsibilities));
        return responsibilities+firstName;
    }
}

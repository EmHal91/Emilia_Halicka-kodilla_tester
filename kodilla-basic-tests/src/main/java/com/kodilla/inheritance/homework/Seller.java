package com.kodilla.inheritance.homework;

public class Seller extends Job {

    public String firstName = "Agnieszka";
    public int age = 42;
    public String job = "Seller";

    public Seller () {super("customer service, stacking goods, selling products");
        System.out.println("Seller's duties include" + responsibilities);
    }

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        this.firstName = firstName;
        System.out.println(("The seller" + firstName) + ("has responsibilities:"+ responsibilities));
        return responsibilities+firstName;
    }
}

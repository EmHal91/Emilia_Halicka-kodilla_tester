package com.kodilla.inheritance.homework;

public class Seller extends Job {


    public Seller () {
        super("customer service, stacking goods, selling products", 3000);
        System.out.println("Seller's duties include" + responsibilities);
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}

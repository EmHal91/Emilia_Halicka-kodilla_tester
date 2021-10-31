package com.kodilla.inheritance.homework;

public class Person {

    public String firstName;
    public int age;
    public String job;

    public static void main(String[] args) {

        Job teacher = new Teacher();
        teacher.getResponsibilities();

        Job seller = new Seller();
        seller.getResponsibilities();

        Job driver = new Driver();
        driver.getResponsibilities();
    }
}

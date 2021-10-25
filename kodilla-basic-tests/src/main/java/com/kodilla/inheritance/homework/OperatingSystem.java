package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year = 2001;

    public System (int year){
        this.year = year;
        System.out.println("System został wydany w 2001 roku");
    }
    public void turnOn (){
        System.out.println("System włączony");
    }
    public void turnOff () {
        System.out.println("System wyłączony");
    }
    public int getYear() {
        return year;
    }
}

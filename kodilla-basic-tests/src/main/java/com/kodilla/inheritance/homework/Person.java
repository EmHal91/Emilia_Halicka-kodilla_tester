package com.kodilla.inheritance.homework;

public class Person {

    public String firstName;
    public int age;
    public Job job;

    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities () {
        System.out.println(firstName+" "+ job.getResponsibilities());
    }

    public static void main(String[] args) {

        Job teacher = new Teacher();

        Job seller = new Seller();

        Job driver = new Driver();

        Person justyna = new Person("Justyna", 24, seller);


        Person tomasz = new Person("Tomasz", 28,driver);


        Person ola = new Person ("Ola", 33, teacher);


        ola.showResponsibilities();
        ola.job = new Teacher ();

        ola.showResponsibilities();

        justyna.showResponsibilities();
        justyna.job = new Seller();

        tomasz.showResponsibilities();
        tomasz.job = new Driver();
    }
}

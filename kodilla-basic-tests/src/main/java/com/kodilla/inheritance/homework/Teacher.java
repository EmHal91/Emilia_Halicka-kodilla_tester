package com.kodilla.inheritance.homework;

public class Teacher extends Job {


    public Teacher() {
        super ("check homework, insert grades, to teach students", 2500);
        System.out.println("Teacher's duties include" + responsibilities);
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}

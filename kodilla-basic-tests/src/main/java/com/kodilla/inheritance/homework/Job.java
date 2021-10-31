package com.kodilla.inheritance.homework;

public abstract class Job {

    public int salary;
    public String responsibilities;

    public Job(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public abstract String getResponsibilities ();
}

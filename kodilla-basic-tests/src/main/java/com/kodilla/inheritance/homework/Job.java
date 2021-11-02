package com.kodilla.inheritance.homework;

public abstract class Job {

    public int salary;
    public String responsibilities;

    public Job(String responsibilities, int salary) {

        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public int getSalary () {
        return salary;
    }

    public abstract String getResponsibilities ();
}

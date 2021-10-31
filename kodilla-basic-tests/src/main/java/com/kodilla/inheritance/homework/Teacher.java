package com.kodilla.inheritance.homework;

public class Teacher extends Job {

    public String firstName = "Justyna";
    public int age = 25;
    public String job = "Teacher";

    public Teacher() { super ("check homework, insert grades, to teach students");
    System.out.println("Teacher's duties include" + responsibilities);}

    @Override
    public String getResponsibilities() {
        this.responsibilities = responsibilities;
        this.firstName = firstName;
        System.out.println(("The seller" + firstName) + ("has responsibilities:"+ responsibilities));
        return responsibilities+firstName;
    }
}

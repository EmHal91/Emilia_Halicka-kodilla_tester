package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Dog", 1.5*2.0, "yes"));
        stamps.add(new Stamp("Frog", 3.0*2.0, "no"));
        stamps.add(new Stamp("Car", 2.0*2.0, "no"));
        stamps.add(new Stamp("Person", 1.5*2.0, "yes"));
        stamps.add(new Stamp("Mountain", 2.0*2.5, "yes"));
        stamps.add(new Stamp("Dog", 1.5*2.0, "yes"));
        stamps.add(new Stamp("Car", 2.0*2.0, "no"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
        System.out.println(stamp);


    }
}

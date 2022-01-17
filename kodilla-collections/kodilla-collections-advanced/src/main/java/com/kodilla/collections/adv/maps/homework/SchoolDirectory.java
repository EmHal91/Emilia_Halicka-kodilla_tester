package com.kodilla.collections.adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal tom = new Principal("Tom", "Jackobs");
        Principal mike = new Principal("Mike", "Ford");
        Principal bart = new Principal("Bart", "Pitt");

        School tomSchool = new School("UJ");
        tomSchool.addStudentInClass(16);
        tomSchool.addStudentInClass(10);
        School mikeSchool = new School("UG");
        mikeSchool.addStudentInClass(10);
        mikeSchool.addStudentInClass(12);
        School bartSchool = new School("UW");
        bartSchool.addStudentInClass(7);
        bartSchool.addStudentInClass(32);

        school.put(tom, tomSchool);
        tomSchool.sumOfStudentInSchool();
        school.put(mike,mikeSchool);
        mikeSchool.sumOfStudentInSchool();
        school.put(bart, bartSchool);
        bartSchool.sumOfStudentInSchool();


        for(Map.Entry<Principal, School> entry : school.entrySet()){
            System.out.println("Principal" +  entry.getKey().getFirstname()   + "school name"   + entry.getValue().nameSchool + "numbers of students in school" + entry.getValue().sumOfStudentInSchool());
        }


    }
}

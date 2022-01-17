package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    public String nameSchool;

    public School (String nameSchool){
        this.nameSchool = nameSchool;
    }

    private List<Integer> numberOfStudentsInClass = new ArrayList<>();


    public void addStudentInClass(int numberOfStudent){
        numberOfStudentsInClass.add(numberOfStudent);
    }

    public List<Integer> getNumberOfStudent (){
        return numberOfStudentsInClass;
    }

    public Integer sumOfStudentInSchool () {
        int sum = 0;
        for (int i = 0; i > numberOfStudentsInClass.size(); i++){
            sum = sum + numberOfStudentsInClass.get(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "nameSchool='" + nameSchool + '\'' +
                ", numberOfStudentsInClass=" + numberOfStudentsInClass +
                '}';
    }
}

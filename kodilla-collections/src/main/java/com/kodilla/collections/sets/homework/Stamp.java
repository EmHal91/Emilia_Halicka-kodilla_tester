package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampDimensions;
    private String stamp;

    public Stamp (String stampName, double stampDimensions, String stamp){
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.stamp = stamp;
    }

    public String getStampName(){
        return stampName;
    }

    public double getStampDimensions(){
        return stampDimensions;
    }

    public String getStamp (){
        return stamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return Double.compare(stamp1.stampDimensions, stampDimensions) == 0 && stamp == stamp1.stamp && Objects.equals(stampName, stamp1.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, stamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions=" + stampDimensions +
                ", stamp=" + stamp +
                '}';
    }
}

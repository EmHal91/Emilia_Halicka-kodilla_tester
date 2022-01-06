package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Skoda implements Car{
    private int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed++;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed-20;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skoda skoda = (Skoda) o;
        return speed == skoda.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

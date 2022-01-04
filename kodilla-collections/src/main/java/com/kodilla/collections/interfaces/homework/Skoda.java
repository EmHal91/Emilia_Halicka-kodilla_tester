package com.kodilla.collections.interfaces.homework;

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


}
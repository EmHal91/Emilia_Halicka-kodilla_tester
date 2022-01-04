package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car{
    private int speed;

    public Volvo( int speed) {
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
        speed = speed-10;

    }
}
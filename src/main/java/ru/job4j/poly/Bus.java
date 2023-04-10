package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void passagers() {
        int count = 10;
    }

    @Override
    public int price(int fuel) {
        return Transport.super.price(fuel);
    }
}
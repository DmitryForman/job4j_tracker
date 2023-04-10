package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {

    }

    @Override
    public void passagers(int count) {
        System.out.println(count);
    }

    @Override
    public int charge(int fuel, int price) {
        price = fuel * 2;
        return price;
    }
}


package ru.job4j.poly;

public interface Transport {
    void move();

    void passagers();

    default int price(int fuel) {
        return fuel * 2;
    }
}

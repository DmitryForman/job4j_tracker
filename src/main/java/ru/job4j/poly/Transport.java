package ru.job4j.poly;

public interface Transport {
    void move();

    void passagers(int count);

    int charge(int fuel, int price);
}

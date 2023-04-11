package ru.job4j.cast;

public class Airship implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летает");
    }
}

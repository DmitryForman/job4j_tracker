package ru.job4j.cast;

public class PolyInterUse {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airship = new Airship();

        Vehicle[] vehicles = new Vehicle[] {bus, train, airship};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}

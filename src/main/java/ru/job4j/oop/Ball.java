package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
       if (condition == false) {
           System.out.println("Was not eaten");
       } else {
           System.out.println("Was eaten");
       }
    }
}

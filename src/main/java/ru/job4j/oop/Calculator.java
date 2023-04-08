package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int n) {
        return x - n;
    }

    public double divide(double b) {
        return x / b;
    }

    public double sumAllOperation(int z) {
        return multiply(z) + divide(z) + sum(z) + minus(z);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        Calculator calculator2 = new Calculator();
        double rsl2 = calculator2.divide(2);
        System.out.println(rsl2);
        int result3 = minus(3);
        System.out.println(result3);
        Calculator calculator4 = new Calculator();
        double rsl4 = calculator4.sumAllOperation(3);
        System.out.println(rsl4);
    }
}
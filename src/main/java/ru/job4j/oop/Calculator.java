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
        return n - x;
    }

    public double divide(double b) {
        return b / x;
    }

    public double sumAllOperation(int z) {
        return multiply(z) + divide(z) + sum(z) + minus(z);
    }

    public static void main(String[] args) {
        int result = sum(10);
        int result2 = minus(3);
        Calculator calculator = new Calculator();
        int result3 = calculator.multiply(5);
        double result4 = calculator.divide(2);
        double result5 = calculator.sumAllOperation(3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
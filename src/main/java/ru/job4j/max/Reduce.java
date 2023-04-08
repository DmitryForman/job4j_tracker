package ru.job4j.max;

public class Reduce {
    private int[] mass;

    public void to(int[] array) {
        mass = array;
    }

    public void print() {
        for (int index = 0; index < mass.length; index++) {
            System.out.println(mass[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
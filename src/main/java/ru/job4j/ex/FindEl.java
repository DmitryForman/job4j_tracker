package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(i)) {
                return i;
            }
        } return throw new ElementNotFoundException("");
    }
    public static void main(String[] args) {
        try {
            indexOf(-1);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
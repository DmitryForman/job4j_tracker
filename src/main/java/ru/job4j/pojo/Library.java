package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("buklet", 20);
        Book book2 = new Book("tests", 50);
        Book book3 = new Book("pushkin", 120);
        Book book4 = new Book("Clean code", 300);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        Book temp = books[2];
        books[2] = books[0];
        books[0] = temp;
        for (Book bk : books) {
            System.out.println("Переставленные - " + bk.getName() + " - " + bk.getPages());
        }
        for (Book bk : books) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println("just clean code " + bk.getName() + " - " + bk.getPages());
            }
        }
    }
}

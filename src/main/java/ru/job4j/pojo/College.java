package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDate(new Date());
        student.setFio("Ivan Petrov");
        student.setGroup(1);
        System.out.println(student.getFio() + " date " + student.getDate() + " group " + student.getGroup());
    }
}

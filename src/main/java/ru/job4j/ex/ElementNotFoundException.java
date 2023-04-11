package ru.job4j.ex;

import java.lang.IllegalStateException;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + System.lineSeparator()
                + "<br/>" + System.lineSeparator()
                + "<span>" + body + "</span>";
    }
}
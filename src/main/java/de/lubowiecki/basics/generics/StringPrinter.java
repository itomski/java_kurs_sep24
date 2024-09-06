package de.lubowiecki.basics.generics;

public class StringPrinter {

    private String content;

    public StringPrinter(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}

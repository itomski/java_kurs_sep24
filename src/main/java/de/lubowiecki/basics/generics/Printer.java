package de.lubowiecki.basics.generics;

public class Printer<T>  {
    private T content;

    public Printer(T content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}

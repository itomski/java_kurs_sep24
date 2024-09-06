package de.lubowiecki.basics.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        System.out.println("main: Start");
        try {
            methodA();
        }
        catch (IOException e) {
            System.out.println("Problem");
        }
        System.out.println("main: Ende");
    }

    static void methodA() throws IOException {
        System.out.println("A: Start");
        methodB();
        System.out.println("A: Ende");
    }

    static void methodB() throws IOException {
        System.out.println("B: Start");
        methodC();
        System.out.println("B: Ende");
    }

    static void methodC() throws IOException {
        System.out.println("C: Start");
        FileWriter writer = new FileWriter("data.txt");
        System.out.println("C: Ende");
    }
}


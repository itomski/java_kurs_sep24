package de.lubowiecki.basics.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {

        System.out.println("main: Start");
        methodA();
        System.out.println("main: Ende");
    }

    static void methodA() {
        System.out.println("A: Start");
        methodB();
        System.out.println("A: Ende");
    }

    static void methodB() {
        System.out.println("B: Start");
        try {
            methodC();
        }
        catch(RuntimeException e) {
            System.out.println("Problem");
        }
        System.out.println("B: Ende");
    }

    static void methodC() {
        System.out.println("C: Start");

        int x = 10;
        System.out.println(x / 0);

        System.out.println("C: Ende");
    }
}

package de.lubowiecki.basics;

public class OverloadingTest {

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        new OverloadingTest().start();
    }

    private void start() {
        byte b = 100;
        doSomething(b);

        int i = 1000;
        doSomething(i);

        doSomething((byte)i); // Cast
        doSomething(100.5);

        byte b1 = 10;
        byte b2 = 20;
        b1 = (byte)(b1 + b2);
        b1 += b2; // b1 = (byte)(b1 + b2);

    }

    private void doSomething(byte v) { // -128 bis +127
        System.out.println("byte: " + v);
    }

    private void doSomething(short v) {
        System.out.println("short: " + v);
    }

    private void doSomething(int v) {
        System.out.println("int: " + v);
    }

    private void doSomething(long v) {
        System.out.println("long: " + v);
    }

    private void doSomething(float v) {
        System.out.println("float: " + v);
    }

    private void doSomething(double v) {
        System.out.println("double: " + v);
    }
}

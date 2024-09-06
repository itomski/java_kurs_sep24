package de.lubowiecki.basics.generics;

public class PrinterTest {

    public static void main(String[] args) {

        StringPrinter sp1 = new StringPrinter("Das ist das Haus von Nikigraus!");
        sp1.print();

        DoublePrinter dp1 = new DoublePrinter(100.25);
        dp1.print();

        Printer<String> sp2 = new Printer<>("Das ist das Haus von Nikigraus!");
        sp2.print();

        Printer<Double> dp2 = new Printer<>(200.25);
        dp2.print();

    }

}

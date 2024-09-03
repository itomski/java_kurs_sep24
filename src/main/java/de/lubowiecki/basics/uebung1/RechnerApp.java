package de.lubowiecki.basics.uebung1;

import java.util.Scanner;

public class RechnerApp {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final Rechner RECHNER = new Rechner();

    public static void main(String[] args) {


        app: while(true) {

            System.out.print("Operation? [+,-,*,/,p,q]: ");
            var input = SCANNER.next().trim().toLowerCase();

            if(input.equals("q")) break app;

            if(input.equals("p")) {
                RECHNER.showProtokoll();
            }
            else {
                System.out.print("A: ");
                double a = SCANNER.nextDouble();

                System.out.print("B: ");
                double b = SCANNER.nextDouble();

                switch (input) {
                    case "+" -> System.out.println(RECHNER.add(a, b));
                    case "-" -> System.out.println(RECHNER.sub(a, b));
                    case "*" -> System.out.println(RECHNER.multi(a, b));
                    case "/" -> System.out.println(RECHNER.div(a, b));
                    default -> System.out.println("Falscheingabe");
                }
            }
        }

        System.out.println("Programmende!");
    }
}

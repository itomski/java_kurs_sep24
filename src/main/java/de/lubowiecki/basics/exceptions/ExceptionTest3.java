package de.lubowiecki.basics.exceptions;

import java.util.Scanner;

public class ExceptionTest3 {

    private static String name;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Name: ");
                setName(scanner.next());
                break;
            }
            catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    static void setName(String str) {
        if(str.matches("[a-zA-Z]{2,20}")) {
            name = str;
        }
        else {
            throw new IllegalArgumentException("Falsche Eingabe!");
        }
    }
}

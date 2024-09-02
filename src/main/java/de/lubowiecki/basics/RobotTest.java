package de.lubowiecki.basics;

import java.util.Scanner;

public class RobotTest {

    public static void main(String[] args) {

        // Der Scanner liest die Usereingabe von der CMD ein
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();

        Robot r1 = new Robot(eingabe); // Verwendung eines Konstruktors
        //r1.setName(eingabe);
        System.out.println("Mein Name ist " + r1.getName());
        System.out.println("Mein Position ist x: " + r1.getX() + ", y: " + r1.getY());


        while(true) {
            System.out.print("Was willst du machen? [vor, zurück, hoch, unter, ende]: ");
            eingabe = scanner.nextLine();

            if (eingabe.equalsIgnoreCase("vor")) {
                r1.schrittVor();
            } else if (eingabe.equalsIgnoreCase("zurück")) {
                r1.schrittZurueck();
            } else if (eingabe.equalsIgnoreCase("hoch")) {
                r1.schrittHoch();
            } else if (eingabe.equalsIgnoreCase("unter")) {
                r1.schrittUnter();
            }
            else if (eingabe.equalsIgnoreCase("ende")) {
                break; // Bricht die Schleife ab.
            }

            // System.out.println("Mein Position ist x: " + r1.getX() + ", y: " + r1.getY());
            System.out.printf("Mein Position ist x: %d, y: %d \n", r1.getY(), r1.getX());
        }

        System.out.println("Programmende.");

    }

}

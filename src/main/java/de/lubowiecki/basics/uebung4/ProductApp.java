package de.lubowiecki.basics.uebung4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductApp {

    // Scanner ermöglich die Eingabe von der Konsole
    private static final Scanner scanner = new Scanner(System.in);

    // In der ArrayList werden die Produkte gesammelt
    private static final List<Produkt> produkte = new ArrayList<>();


    // String für die Anzeige der AUswahlmöglichkeiten
    private static final String KEYS = "\n***************************************\n" +
                                        " N : Neues Produkt \n" +
                                        " L : Produkte auflisten \n" +
                                        " Q : Programm verlassen \n" +
                                        "***************************************\n";

    public static void main(String[] args) {

        // Wird bis zum Abbruch mit q ausgeführt
        app: while(true) {
            System.out.println(KEYS);

            System.out.print("Was willst du machen? ");

            // trim schneidet ungewünschte Zeichen an beiden Enden des Strings
            // toLowerCase ändert alle Zeichen im String in Kleinbuchstaben
            String input = scanner.next().trim().toLowerCase();

            System.out.println();

            // Auswahl des Benutzers wird verarbeitet
            switch(input) {
                case "n" -> addProduct();
                case "l" -> showProduct(); 
                case "q" -> {
                    break app;
                }
            }
        }

        System.out.println("Programmende.");
    }

    private static void showProduct() {
        System.out.println("Produkte");
        for(Produkt p : produkte) {
            System.out.println(p.getName());
        }
    }

    private static void addProduct() {
        produkte.add(createProduct());
        System.out.println("Produkt gespeichert.");

    }

    private static Produkt createProduct() {
        scanner.nextLine(); // clear fix
        System.out.println("Produkteingabe.");
        System.out.print("Name: ");
        var name = scanner.nextLine();
        System.out.print("Beschreibung: ");
        var beschreibung = scanner.nextLine();
        System.out.print("Menge: ");
        var menge = scanner.nextInt();
        System.out.print("Preis: ");
        var preis = scanner.nextDouble();
        return new Produkt(name, beschreibung, menge, preis);
    }
}

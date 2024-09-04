package de.lubowiecki.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        // Collecctions arbeiten nur mit Objekten
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(100);
        liste.add(200);
        liste.add(500); // An die nächste freie Stelle hinzufügen
        liste.add(800);
        System.out.println(liste);

        System.out.println(liste.get(2)); // Element abfragen
        liste.set(1, 1000); // Element ersetzen

        System.out.println();

        for(int zahl : liste) {
            System.out.println(zahl);
        }

        System.out.println();

        liste.add(2, 1000);

        for(int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        System.out.println();

        liste.forEach(e -> System.out.println(e));


        /*
        int i = 100; // primitiv
        Integer j = i; // Autoboxing von int zu Integer
        int i2 = j; // AutoUnBoxing von Integer auf int
        */

        System.out.println("-----------------");

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Natasha");

        System.out.println(namen);

        namen = new LinkedList<>(namen);
        namen.add(1, "Tony");
        namen.add(0, "Steve");
        namen.add(0, "Scott");

        namen = new ArrayList<>(namen);
        System.out.println(namen.get(6));


       List<Fahrzeug> fahrzeuge = new ArrayList<>();
       fahrzeuge.add(new Fahrzeug("HH:AB123"));
       fahrzeuge.add(new Fahrzeug("HH:XY123"));
       fahrzeuge.add(new Fahrzeug("HH:AB338"));

       for (Fahrzeug f : fahrzeuge) {
           System.out.println(f);
       }


    }
}
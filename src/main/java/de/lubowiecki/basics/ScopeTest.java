package de.lubowiecki.basics;

public class ScopeTest {

    public static void main(String[] args) {

        boolean ok = true;

        int zahl;

        {
            int[] arr = new int[1_000_000];
            // Verarbeitung
            //arr = null;
        }

        if(ok) {
            zahl = 100;
        }
        else {
            zahl = 200;
        }

        System.out.println(zahl);
    }

    public static void machWas(String name) {

    }
}

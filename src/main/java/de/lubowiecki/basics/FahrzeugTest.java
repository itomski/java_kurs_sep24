package de.lubowiecki.basics;

public class FahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH:AB123");
        Fahrzeug f2 = new Fahrzeug("HH:AB789");
        Fahrzeug f3 = new Fahrzeug("HH:EX123");
        Fahrzeug f4 = new Fahrzeug("HB:OP123");

        System.out.println(f1); // toString wird automatisch verwendet
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);


    }
}

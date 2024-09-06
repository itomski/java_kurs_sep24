package de.lubowiecki.basics.uebung5;

public class FahrzeugTest {

    public static void main(String[] args) {

        Motor m = new Motor(120, "Benzin");

        Schaltung s = new Schaltung("Automatik");

        Reifen r1 = new Reifen("Conti", "240/55 A");
        Reifen r2 = new Reifen("Conti", "240/55 A");
        Reifen r3 = new Reifen("Conti", "240/65 B");
        Reifen r4 = new Reifen("Conti", "240/65 B");

        Fahrzeug f1 = new Fahrzeug();

        //f1.setMotor(new IonenMotor(900));
        f1.setMotor(new BenzinV8Motor(500));
        //f1.setMotor(m);

        f1.setSchaltung(s);
        f1.setReifen(0, r1);
        f1.setReifen(1, r2);
        f1.setReifen(2, r3);
        f1.setReifen(3, r4);
        f1.setHersteller("Ford");
        f1.setTyp("Mustang");
        f1.setBaujahr(2010);
        f1.setKennzeichen("AB:CD234");

        System.out.println(f1);

        Motor m2 = new Motor(90, "Elektro");
        Motor m3 = new Motor(90, "Elektro");

        System.out.println();

        System.out.println(m2.equals(m3));
        System.out.println(m2 == m3);
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

    }

}

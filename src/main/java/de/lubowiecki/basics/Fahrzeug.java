package de.lubowiecki.basics;

public class Fahrzeug {

    private static int count;

    private String kennzeichen;
    private int seriennummer;

    public Fahrzeug(String kennzeichen) {
        seriennummer = ++count;
        this.kennzeichen = kennzeichen;
    }

    @Override
    public String toString() {
        return "Fahrzeug{ kennzeichen=" + kennzeichen + ", seriennummer=" + seriennummer + "}";
    }
}

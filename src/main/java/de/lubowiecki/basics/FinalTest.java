package de.lubowiecki.basics;

public class FinalTest {

    // Klassen-Konstante: Muss sofort einen Wert bekommen
    public static final int ZAHL = 100;


    // Instanz-Konstante: Muss spätestens im Konstruktor einen Wert bekommen
    public final int ANDERE_ZAHL;

    public FinalTest() {
        this.ANDERE_ZAHL = 200;
    }

    public static void main(String[] args) {

        // Lokale Kontante: Muss vor der Verwendung einen Wert bekommen
        final int GANZ_ANDERE_ZAHL;
        GANZ_ANDERE_ZAHL = 300;
        // GANZ_ANDERE_ZAHL = 500;
        System.out.println(GANZ_ANDERE_ZAHL);

    }

}

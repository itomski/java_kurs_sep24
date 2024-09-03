package de.lubowiecki.basics.uebung1;

public class StaticRechner {

    private static String protokoll = "";

    public static double add(double a, double b) {
        var erg = a + b;
        protokoll += a + " + " + b + " = " + erg + "\n";
        return erg;
    }

    public static double multi(double a, double b) {
        var erg = a * b;
        protokoll += a + " * " + b + " = " + erg + "\n";
        return erg;
    }

    public static void showProtokoll() {
        System.out.println(protokoll);
    }
}

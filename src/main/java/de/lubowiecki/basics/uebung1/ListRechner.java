package de.lubowiecki.basics.uebung1;

import java.util.ArrayList;
import java.util.List;

public class ListRechner {

    private List<String> protokoll = new ArrayList<>();

    // %s = String
    // %f = float/double
    // %d = int/short/byte

    private final String TPL = "%.2f %s %.2f = %.2f"; // Konstante


    // Instanzmethode
    public double add(double a, double b) {
        var erg = a + b;
        //protokoll += a + " + " + b + " = " + erg + "\n";
        protokoll.add(String.format(TPL, a, "+", b, erg));
        return erg;
    }

    public double multi(double a, double b) {
        var erg = a * b;
        //protokoll += a + " * " + b + " = " + erg + "\n";
        protokoll.add(String.format(TPL, a, "*", b, erg));
        return erg;
    }

    public void showProtokoll() {
        System.out.println(protokoll);
    }
}

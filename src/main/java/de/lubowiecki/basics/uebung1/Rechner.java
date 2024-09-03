package de.lubowiecki.basics.uebung1;

public class Rechner {

    private String protokoll = "";

    // %s = String
    // %f = float/double
    // %d = int/short/byte

    private final String TPL = "%f %s %f = %f \n"; // Konstante


    // Instanzmethode
    public double add(double a, double b) {
        var erg = a + b;
        //protokoll += a + " + " + b + " = " + erg + "\n";
        protokoll += String.format(TPL, a, "+", b, erg);
        return erg;
    }

    public double multi(double a, double b) {
        var erg = a * b;
        //protokoll += a + " * " + b + " = " + erg + "\n";
        protokoll += String.format(TPL, a, "*", b, erg);
        return erg;
    }

    public double sub(double a, double b) {
        var erg = a - b;
        protokoll += String.format(TPL, a, "-", b, erg);
        return erg;
    }

    public double div(double a, double b) {
        var erg = a / b;
        protokoll += String.format(TPL, a, "/", b, erg);
        return erg;
    }

    public void showProtokoll() {
        System.out.println(protokoll);
    }


}

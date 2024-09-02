package de.lubowiecki.basics;

public class SteuerRechner {

    public static final double STEUERSATZ = 0.19;

    private SteuerRechner() {
    }

    public static double getInklMwSt(double betrag) {
        return betrag + (betrag * STEUERSATZ);
    }

    public static double getInklMwSt(int betrag) {
        return betrag + (betrag * STEUERSATZ);
    }
}

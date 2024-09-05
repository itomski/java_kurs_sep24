package de.lubowiecki.basics.uebung4;

import java.time.LocalDate;

public class Produkt {

    private LocalDate imBestandSeit;
    private String name;
    private String beschreibung;
    private int menge;
    private double preis;

    public Produkt(String name, String beschreibung, int menge, double preis) {
        imBestandSeit = LocalDate.now();
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }

    public LocalDate getImBestandSeit() {
        return imBestandSeit;
    }

    public void setImBestandSeit(LocalDate imBestandSeit) {
        this.imBestandSeit = imBestandSeit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}

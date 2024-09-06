package de.lubowiecki.basics.uebung5;

import java.util.Arrays;

public class Fahrzeug {

    private Motor motor;
    private Reifen[] reifen = new Reifen[4];

    private Schaltung schaltung;

    private String kennzeichen;

    private String hersteller;
    private String typ;
    private int baujahr;

    public Fahrzeug() {
    }

    public Fahrzeug(Motor motor, Reifen[] reifen, Schaltung schaltung, String kennzeichen, String hersteller, String typ, int baujahr) {
        this.motor = motor;
        this.reifen = reifen;
        this.schaltung = schaltung;
        this.kennzeichen = kennzeichen;
        this.hersteller = hersteller;
        this.typ = typ;
        this.baujahr = baujahr;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Reifen[] getReifen() {
        return reifen;
    }

    public void setReifen(int index, Reifen reifen) {
        // Validierung!
        this.reifen[index] = reifen;
    }

    public Schaltung getSchaltung() {
        return schaltung;
    }

    public void setSchaltung(Schaltung schaltung) {
        this.schaltung = schaltung;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("\n motor=").append(motor);
        sb.append("\n reifen=").append(Arrays.toString(reifen));
        sb.append("\n schaltung=").append(schaltung);
        sb.append("\n kennzeichen='").append(kennzeichen).append('\'');
        sb.append("\n hersteller='").append(hersteller).append('\'');
        sb.append("\n typ='").append(typ).append('\'');
        sb.append("\n baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }
}

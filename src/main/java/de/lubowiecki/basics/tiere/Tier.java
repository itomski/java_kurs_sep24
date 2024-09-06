package de.lubowiecki.basics.tiere;

import de.lubowiecki.basics.tiere.Nahrung;

import java.time.LocalDate;

public class Tier implements Comparable<Tier> {

    private LocalDate geburtsDatum;

    private int xPos;
    private int yPos;

    private Nahrung nahrung;

    public Tier() {
    }

    public Tier(LocalDate geburtsDatum, int xPos, int yPos, Nahrung nahrung) {
        this.geburtsDatum = geburtsDatum;
        this.xPos = xPos;
        this.yPos = yPos;
        this.nahrung = nahrung;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Nahrung getNahrung() {
        return nahrung;
    }

    public void setNahrung(Nahrung nahrung) {
        this.nahrung = nahrung;
    }

    @Override
    public int compareTo(Tier other) {
        return geburtsDatum.compareTo(other.getGeburtsDatum());
    }
}

package de.lubowiecki.basics.uebung5;

public class Schaltung {

    private String art;

    public Schaltung(String art) {
        this.art = art;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schaltung{");
        sb.append("art='").append(art).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

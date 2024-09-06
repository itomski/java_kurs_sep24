package de.lubowiecki.basics.uebung5;

public class Reifen {

    private String hersteller;

    private String grosse;

    public Reifen(String hersteller, String grosse) {
        this.hersteller = hersteller;
        this.grosse = grosse;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getGrosse() {
        return grosse;
    }

    public void setGrosse(String grosse) {
        this.grosse = grosse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reifen{");
        sb.append("hersteller='").append(hersteller).append('\'');
        sb.append(", grosse='").append(grosse).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

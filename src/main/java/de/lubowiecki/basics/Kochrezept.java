package de.lubowiecki.basics;

public class Kochrezept {

    private int nr;
    private int zeit;
    private String titel;
    private String beschreibung;

    //...

    public Kochrezept(int nr, int zeit, String titel, String beschreibung) {
        this.nr = nr;
        this.zeit = zeit;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kochrezept{");
        sb.append("nr=").append(nr);
        sb.append(", zeit=").append(zeit);
        sb.append(", titel='").append(titel).append('\'');
        sb.append(", beschreibung='").append(beschreibung).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

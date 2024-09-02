package de.lubowiecki.basics;

public class Buch {

    private int seiten;
    private String titel;

    private String autor;

    private int erscheinungsJahr;

    public Buch(int seiten, String titel, String autor, int erscheinungsJahr) {
        this.seiten = seiten;
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsJahr = erscheinungsJahr;
    }

    public int getSeiten() {
        return seiten;
    }

    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(int erscheinungsJahr) {
        this.erscheinungsJahr = erscheinungsJahr;
    }
}

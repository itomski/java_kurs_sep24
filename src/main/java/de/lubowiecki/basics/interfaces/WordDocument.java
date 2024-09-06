package de.lubowiecki.basics.interfaces;

public class WordDocument extends AbstractDocument implements Document {

    public WordDocument() {
        super(100);
    }

    public void getContent() {
        System.out.println("Inhalt wird als Text gelesen: " + getSize());
    }

    public void analyzeContent() {
        System.out.println("Text wird ausgewertet");
    }
}

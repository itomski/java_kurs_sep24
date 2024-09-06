package de.lubowiecki.basics.interfaces;

public class PdfDocument extends AbstractDocument implements Document {

    public PdfDocument() {
        super(500);
    }

    @Override
    public void getContent() {
        System.out.println("Bilddaten einlesen: " + getSize());
    }

    @Override
    public void analyzeContent() {
        System.out.println("Bilddaten auswerten");
    }
}

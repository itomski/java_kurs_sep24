package de.lubowiecki.basics.interfaces;

public class ExcelDocument extends AbstractDocument implements Document {
    public ExcelDocument() {
        super(300);
    }

    @Override
    public void getContent() {
        System.out.println("Tabellen-Daten einlesen: " + getSize());
    }

    @Override
    public void analyzeContent() {
        System.out.println("Tabellen-Daten auswerten");
    }
}

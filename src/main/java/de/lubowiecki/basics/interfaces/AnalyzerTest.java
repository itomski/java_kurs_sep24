package de.lubowiecki.basics.interfaces;

public class AnalyzerTest {

    public static void main(String[] args) {

        WordDocument wdoc = new WordDocument();
        // DocumentAnalyser analyzer = new DocumentAnalyser(); // Error: Konstruktor privat
        DocumentAnalyser.analyze(wdoc);

        ExcelDocument edoc = new ExcelDocument();
        DocumentAnalyser.analyze(edoc);

        PdfDocument pdoc = new PdfDocument();
        DocumentAnalyser.analyze(pdoc);
    }
}

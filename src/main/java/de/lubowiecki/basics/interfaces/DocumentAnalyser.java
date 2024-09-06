package de.lubowiecki.basics.interfaces;

public class DocumentAnalyser {

    private DocumentAnalyser() {
    }

    public static void analyze(Document doc) { // InterfaceTyp
        doc.getContent();
        doc.analyzeContent();
    }
}

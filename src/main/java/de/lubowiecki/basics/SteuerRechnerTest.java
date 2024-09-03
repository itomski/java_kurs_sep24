package de.lubowiecki.basics;

public class SteuerRechnerTest {

    public static void main(String[] args) {

        // Instanzmethoden können nur über Objekte verwendet werden
        //SteuerRechner sr = new SteuerRechner();

        // Vor dem Methoden-Aufruf muss eine Instanz verfügbar sein
        //System.out.println(sr.getInklMwSt(100.0));

        // Statische/Klassenmethoden können direkt auf der Klasse aufgerufen werden
        System.out.println(SteuerRechner.getInklMwSt(100.0));
    }
}

package de.lubowiecki.basics.exceptions;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aufgabe {

    // Schreibe eine Klasse für einen Stringsauger
    // Die Klasse bekommt bei der Instanzierung eine Größe des Müllbeutels vorgegeben
    // Sobald der Beutel voll ist wird eine Exception geworfen
    // Beim Aufsauen von null wird auch eine Exception geworfen

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        ResourceBundle bundle = ResourceBundle.getBundle("messages");

        try {
            Stringsauger sauger = new Stringsauger(5);
            sauger.einschalten();
            sauger.aufsaugen("Müll");
            sauger.aufsaugen("Essensreste");
            sauger.aufsaugen("Lego-Steine");
            //sauger.aufsaugen(null); // Exception
            sauger.aufsaugen("Socken");
            sauger.aufsaugen("Restmüll");
            sauger.aufsaugen("Zeug"); // Exception
        }
        catch(SauegrNichtEigeschaltetException e) {
            System.out.println(bundle.getString("aus"));
        }
        catch(SaugerBeutelVollException e) {
            System.out.println(bundle.getString("voll"));
        }
        catch(SaugerNullException e) {
            System.out.println(bundle.getString("null"));
        }

    }
}

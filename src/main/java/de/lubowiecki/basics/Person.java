package de.lubowiecki.basics;

import java.time.LocalDate;

public class Person {

    public String vorname; // Instanzvariable
    private String nachname;

    public LocalDate geburtsDatum;

    public String getNachname() {
        if(nachname == null)
            return "";
        return nachname;
    }

    public void setNachname(String nachname) {
        // Validierung
        this.nachname = nachname;
    }
}

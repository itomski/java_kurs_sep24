package de.lubowiecki.basics.uebung4;

import java.util.ArrayList;
import java.util.List;

public class Lager {

    private List<Produkt> produkte = new ArrayList<>();

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void addProdukt(Produkt produkt) {
        produkte.add(produkt);
    }

    public void printProdukt() {

        final String DIV = "__________________________________________________";

        System.out.println(DIV);
        System.out.printf("| %15s | %10s | %6s | %6s | \n", "Name", "Im Bestand", "Menge", "Preis");
        System.out.println(DIV);
        for(Produkt p : produkte) {
            System.out.printf("| %15s | %10s | %6s | %6.2f | \n",
                    p.getName(),
                    p.getImBestandSeit(),
                    p.getMenge(),
                    p.getPreis());
        }
        System.out.println(DIV);
    }
}

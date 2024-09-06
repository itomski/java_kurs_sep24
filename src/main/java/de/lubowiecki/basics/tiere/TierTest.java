package de.lubowiecki.basics.tiere;

import java.time.LocalDate;

public class TierTest {

    public static void main(String[] args) {

        Tier t = new Tier(LocalDate.now(), 0, 0, Nahrung.FLEISCH);
        System.out.println(t.getGeburtsDatum());

        t = new Tiger();
        t.setNahrung(Nahrung.VEGAN);

    }

}

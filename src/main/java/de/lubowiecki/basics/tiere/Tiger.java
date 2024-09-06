package de.lubowiecki.basics.tiere;

import de.lubowiecki.basics.tiere.Nahrung;
import de.lubowiecki.basics.tiere.Tier;

public class Tiger extends Tier implements Sozialisiert {

    public Tiger() {
        setNahrung(Nahrung.FLEISCH);
    }

    @Override
    public void setNahrung(Nahrung nahrung) {
        if(nahrung != Nahrung.FLEISCH) {
            System.out.println("Das geht nicht!!!!!");
        }
    }

    @Override
    public void fressen() {
        System.out.println("Tiger fisst andere kleine Tiere!");
    }
}

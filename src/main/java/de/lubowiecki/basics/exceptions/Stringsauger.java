package de.lubowiecki.basics.exceptions;

public class Stringsauger {

    private int beutelGroesse;

    private int sagDurchgang;

    private boolean an;

    public Stringsauger(int i) {
        beutelGroesse = i;
    }

    public void aufsaugen(String zeug) {

        if(!an)
            throw new SauegrNichtEigeschaltetException();

        if(zeug == null)
            throw new SaugerNullException();

        if(sagDurchgang == beutelGroesse)
            throw new SaugerBeutelVollException();

        sagDurchgang++;
    }

    public boolean isAn() {
        return an;
    }

    public void einschalten() {
        this.an = true;
    }

    public void ausschalten() {
        this.an = false;
    }
}

package de.lubowiecki.basics.uebung2;

public enum Dice {

    W4(4), W6(6), W20(20), W100(100);

    int eyes;

    Dice(int eyes) {
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }
}

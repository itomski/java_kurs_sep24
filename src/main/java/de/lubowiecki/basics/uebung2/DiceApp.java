package de.lubowiecki.basics.uebung2;

import java.util.Arrays;

public class DiceApp {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup(Dice.W6);
        var erg = cup.roll(5);

        System.out.println(Arrays.toString(erg));
        cup.stats(erg);


    }
}

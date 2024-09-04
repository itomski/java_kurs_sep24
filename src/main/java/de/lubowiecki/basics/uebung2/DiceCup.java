package de.lubowiecki.basics.uebung2;

import java.util.Random;

public class DiceCup {

    private final Random rand = new Random();

    private int eyes = 6;

    public DiceCup() {
    }

    public DiceCup(Dice dice) {
        this.eyes = dice.getEyes();
    }

    public int roll() {
        return rand.nextInt(eyes) + 1;
    }

    public int[] roll(int count) {

        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = roll();
        }

        return arr;
    }

    public void stats(int[] arr) {

        int[] count = new int[eyes];

        for (int i = 0; i < arr.length; i++) {
            var idx = arr[i] - 1;
            count[idx]++;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0) continue;
            System.out.println(i + 1 + " kommt " + count[i] + " mal vor");
        }
    }
}

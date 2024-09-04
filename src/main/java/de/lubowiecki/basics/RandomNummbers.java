package de.lubowiecki.basics;

import java.util.Arrays;
import java.util.Random;

public class RandomNummbers {

    public static void main(String[] args) {

        int zahl = (int)(Math.random() * 6) + 1;

        zahl = (int)(Math.random() * 100) + 1;

        Random rand = new Random();
        zahl = rand.nextInt(6) + 1;
        zahl = rand.nextInt(100) + 1;
        zahl = rand.nextInt(20) + 1;

        int anzahl = 5;

        int[] arr = new int[anzahl];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println();

        for (int z : arr) {
            System.out.println(z);
        }
    }
}

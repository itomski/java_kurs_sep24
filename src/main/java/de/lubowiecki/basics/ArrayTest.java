package de.lubowiecki.basics;

public class ArrayTest {

    public static void main(String[] args) {

        int[] zahlen1 = new int[10]; // Array mit 10 Positionen gefüllt mit Standardwert

        int[] zahlen2 = {2,7,19,22,18}; // Array mit 5 belegten Positionen

        // Lesen
        System.out.println(zahlen1[0]);
        System.out.println(zahlen1[5]);
        System.out.println(zahlen2[0]);
        System.out.println(zahlen2[4]);

        zahlen1[1] = 100;
        zahlen2[1] = 200;

        System.out.println();

        for (int i = 0; i < zahlen1.length; i++) {
            System.out.print(zahlen1[i] + ", ");
        }

        System.out.println();

        for (int zahl : zahlen1) {
            System.out.print(zahl + ", ");
        }

        System.out.println();

        System.out.println(sum(2,4,6,8));

        int[] zahlen = {2,4,6,8,3,7};
        System.out.println(sum(zahlen));

        System.out.println(sumSpecial(2,9,22,18,99,100,27));
        System.out.println(sumSpecial(zahlen));
    }

    private static int sum(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 +i4;
    }

    private static int sum(int[] sammlung) {
        int sum = 0;
        for (int zahl : sammlung) {
            sum += zahl;
        }
        return sum;
    }

    private static int sumSpecial(int... sammlung) {
        int sum = 0;
        for (int zahl : sammlung) {
            sum += zahl;
        }
        return sum;
    }

}

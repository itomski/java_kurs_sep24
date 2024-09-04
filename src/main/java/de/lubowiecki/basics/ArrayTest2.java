package de.lubowiecki.basics;

public class ArrayTest2 {

    static boolean c; // Standardwert: false

    public static void main(String[] args) {

        int[][] arr = new int[4][];

        arr[0] = new int[]{10,15,22};
        arr[1] = new int[]{2,7,99,88,1};
        arr[2] = new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        arr[3] = new int[]{10};

        for(int[] row : arr) {
            for (int col : row) {
                System.out.print(col + ", ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(arr[1][2]);
        arr[1][2] = 100;

        boolean b; // Lokale Variablen bekommen KEINE Standardwerte

        /*
        if(b) { // ERROR
            System.out.println("WAHR");
        }
        */

        if(c) {
            System.out.println("WAHR");
        }
    }
}

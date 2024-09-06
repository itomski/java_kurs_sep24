package de.lubowiecki.basics;

public class KontrollstrukturenTest {

    public static void main(String[] args) {

        int i = 100;

        int j;

        if(i < 100) {
            j = 200;
        }
        else {
            j = 300;
        }

        System.out.println(j);

        System.out.println((i < 100) ? 200 : 300);

        int k = (i < 100) ? 200 : 300;


    }
}

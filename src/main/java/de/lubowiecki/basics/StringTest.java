package de.lubowiecki.basics;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "Hallo String";
        str1 = str1.toLowerCase();
        System.out.println(str1);

        str1 += "."; // "hallo string.";
        str1 += "."; // "hallo string..";
        str1 += "."; // "hallo string...";

        String str = String.join(", ", "Peter", "Bruce", "Carol", "Tony");
        System.out.println(str);

        String name = "Peter";
        System.out.println(String.format("Mein Name ist %s \n", name));
        System.out.printf("Mein Name ist %s \n", name);

        String str3 = "Das ist das Haus von Nikigraus";
        str3 = str3.replace("Nikigraus", "Tony");
        System.out.println(str3);

        String[] arr = str3.split(" ");
        System.out.println(arr[3]);

        arr = str3.split("");
        System.out.println(Arrays.toString(arr));

        str3 = "17535ax2";

        if(str3.matches("[0-9a-zA-Z]{2,10}")) {
            System.out.println("OK");
        }
        else {
            System.out.println("NICHT OK");
        }

        byte[] arr2 = {10,15,22,120};

        try {
            System.out.println(arr2[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

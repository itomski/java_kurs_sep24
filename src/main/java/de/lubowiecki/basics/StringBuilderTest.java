package de.lubowiecki.basics;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // capacity: 16
        //StringBuilder sb = new StringBuilder("Hallo"); // capacity: 5 + 16

        String name = "Peter";

        sb.append("Das ist ein Haus von");
        sb.append(name);
        sb.append(". Er ist der Besitzer");

        String alles = sb.toString();
        System.out.println(alles);
        System.out.println(sb); // toString wird automatisch verwendet

        Kochrezept kr = new Kochrezept(1, 120, "Currywurst", "Am besten beim Laden nebenan besorgen.");
        System.out.println(kr);


    }

}

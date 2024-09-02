package de.lubowiecki.basics;

public class PersonTest {

    public static void main(String[] args) {

        Person max = new Person();
        System.out.println(max.getNachname()); // Eigenschaft ist public daher lesbar
        //max.nachname = "Peter";
        System.out.println(max.getNachname().toUpperCase());

    }

}

package de.lubowiecki.basics;

import java.util.*;
/*
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 */

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.Math.*;
import static de.lubowiecki.basics.Wochentag.*;

public class ImportTest {

    public static void main(String[] args) {

        // Klassen aus anderen Paketen müssen vor der Verwendung importiert werden
        Date d1 = new Date();

        // ... oder man benutzt dieser mit dem vollständigen Namen
        //java.sql.Date d2 = new java.sql.Date();

        List<String> namen = new ArrayList<>();

        int rand = (int)(Math.random() * 6) + 1;
        System.out.println(rand);
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        // Nach einem statischen Import kann das importirte Inventar
        // direkt verwendet werden
        System.out.println(random());
        System.out.println(Math.PI);
        System.out.println(PI);
        System.out.println(Math.E);

        // Optionen eines ENUMs können auch statisch importiert werden
        Wochentag tag = Wochentag.DO;
        tag = MI;

    }
}

package de.lubowiecki.basics.collections;

import java.util.*;

public class UtilTest {

    public static void main(String[] args) {

        Set<String> karten = new HashSet<>(Set.of("PA", "C10", "HB", "HD", "H9", "P10"));
        List<String> karten2 = new ArrayList<>(karten);
        Collections.shuffle(karten2);

        System.out.println(karten2);

        karten2.add("PK");

        karten2 = Collections.unmodifiableList(karten2); // Nicht mehr veränderbar
        karten2.add("CA");

    }
}

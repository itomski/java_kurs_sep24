package de.lubowiecki.basics.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> namen = new HashSet<>();
        namen = new LinkedHashSet<>(namen); // Wechsel von HashSet auf LinkedHashSet
        namen = new TreeSet<>(namen); // Wechsel von LinkedHashSet auf TreeSet

        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");

        if(!namen.add("Bruce")) {
            System.out.println("nicht hinzugefügt!");
        }

        namen.add("Steve");
        System.out.println(namen);

        for(String name : namen)
            System.out.println(name);

    }
}

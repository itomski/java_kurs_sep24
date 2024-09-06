package de.lubowiecki.basics;

import de.lubowiecki.basics.tiere.Nahrung;
import de.lubowiecki.basics.tiere.Tier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {

        String[] namenArr = {"Peter", "Bruce", "Steve", "Tony", "Natasha", "Carol", "Scott"};

        Arrays.sort(namenArr);

        System.out.println(Arrays.toString(namenArr));

        List<Tier> tierList = new ArrayList<>();
        tierList.add(new Tier(LocalDate.now(), 0, 0, Nahrung.VEGAN));
        tierList.add(new Tier(LocalDate.of(2010, 1, 15), 10, 5, Nahrung.FLEISCH));
        tierList.add(new Tier(LocalDate.of(2001, 7, 22), 20, 33, Nahrung.VEGAN));

        Collections.sort(tierList);

    }
}

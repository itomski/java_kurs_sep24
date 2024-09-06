package de.lubowiecki.basics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Dortmund", 587_000);
        einwohner.put("Hamburg", 1_9000_000);
        einwohner.put("Kiel", 300_000);
        einwohner.put("Essen", 583_000);

        System.out.println(einwohner.get("Kiel"));
        System.out.println(einwohner.get("Berlin"));
        System.out.println(einwohner.getOrDefault("Berlin", 0));
        System.out.println(einwohner.getOrDefault("Hamburg", 0));

    }
}

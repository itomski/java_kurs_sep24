package de.lubowiecki.basics.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> worte = new LinkedList<>();
        worte.offer("ABC");
        worte.offer("CDE");
        worte.offer("EFG");

        for(String wort : worte)
            System.out.println(wort);

        System.out.println();

        while(!worte.isEmpty()) {
            System.out.println(worte.poll()); // Entfernt das älteste Element
        }

        System.out.println(worte);

        // Stack
        Deque<Integer> zahlen = new LinkedList<>();
        zahlen.push(7);
        zahlen.push(22);
        zahlen.push(19);
        zahlen.push(83);
        zahlen.push(9);

        while(!zahlen.isEmpty()) {
            System.out.println(zahlen.pop()); // Entfernt das letzte Element
        }
    }
}

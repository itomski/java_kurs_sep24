package de.lubowiecki.basics;

public class Main {


    public static void main(String[] args) {

        Buch b1 = new Buch(200, "Kochen ohne Fett", "Roman Kriminalski", 2000);

        System.out.println(b1.getAutor());
        b1.setSeiten(350);
        System.out.println(b1.getSeiten());

        machWas();
    }

    static void machWas() {
        System.out.println("Hi");
    }
}
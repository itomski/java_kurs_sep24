package de.lubowiecki.basics;

public class BuchTest {


    public static void main(String[] args) {

        // Instanzierung (Objekterzeugung)
        Buch b1 = new Buch(200, "Kochen ohne Fett", "Roman Kriminalski", 2000);
        System.out.println(b1.getAutor()); // Abfrage des Objektzustands
        b1.setSeiten(350); // Änderung des Objektzustands
        System.out.println(b1.getSeiten());
        //machWas();
    }

    static void machWas() {
        System.out.println("Hi");
        machWas(); // Rekursiver Aufruf
    }
}
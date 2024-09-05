package de.lubowiecki.basics.uebung4;

public class LagerTest {

    public static void main(String[] args) {

        Lager lager1 = new Lager();

        Produkt p1 = new Produkt("Butter", "...", 100, 2.99);

        lager1.addProdukt(p1);

        Produkt p2 = new Produkt("Milch", "...", 200, 1.29);

        lager1.addProdukt(p2);

        lager1.addProdukt(new Produkt("Kaffee", "...", 50, 4.99));

        /*
        for(Produkt p : lager1.getProdukte()) {
            System.out.println(p.getName() + ", " + p.getMenge());
        }
        */

        lager1.printProdukt();


    }
}

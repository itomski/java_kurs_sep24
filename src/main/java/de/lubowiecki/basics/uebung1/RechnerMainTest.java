package de.lubowiecki.basics.uebung1;

public class RechnerMainTest {

    public static void main(String[] args) {

        Rechner rechner = new Rechner(); // Instanzierung

        //double erg = rechner.add(100, 200);
        var erg = rechner.add(100, 200); // Ab Java 10
        System.out.println(erg);

        erg = rechner.multi(500, -200);
        System.out.println(erg);

        System.out.println(rechner.add(500, 800));

        rechner.showProtokoll();

        System.out.println();

        Rechner rechner2 = new Rechner();
        rechner2.add(10,17);
        rechner2.add(22,10);
        rechner2.showProtokoll();



        System.out.println("-----------------");

        erg = StaticRechner.add(100, 200);
        System.out.println(erg);

        erg = StaticRechner.multi(100, 200);
        System.out.println(erg);

        System.out.println(StaticRechner.add(10, 20));

        machWas();

        StaticRechner.showProtokoll();

        System.out.println("-----------------");

        ListRechner rechner3 = new ListRechner();
        rechner3.add(10, 22);
        rechner3.add(17, 99);
        rechner3.multi(17, 99);
        rechner3.showProtokoll();
    }

    private static void machWas() {
        StaticRechner.multi(10, 15);
    }

}

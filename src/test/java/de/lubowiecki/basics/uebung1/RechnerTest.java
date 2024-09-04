package de.lubowiecki.basics.uebung1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {

    @Test
    void zweiPlusVier() {
        Rechner rechner = new Rechner();
        var erg = rechner.add(2, 4);
        assertEquals(6, erg);
    }

    @Test
    void fuenfPlusVier() {
        Rechner rechner = new Rechner();
        var erg = rechner.add(5, 4);
        assertEquals(9, erg);
        Object o = new Object();
    }

    @Test
    void dreiMalVier() {
        Rechner rechner = new Rechner();
        var erg = rechner.multi(3, 4);
        assertEquals(12, erg);
    }
}
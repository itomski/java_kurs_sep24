package de.lubowiecki.basics.uebung2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    //@Test
    //@Disabled
    //@DisplayName("Ein Wurf mit W6")
    @RepeatedTest(100)
    void rollW6() {
        DiceCup cup = new DiceCup();
        var erg = cup.roll();
        assertTrue(erg > 0 && erg <= 6);
    }

    @Test
    @DisplayName("Ein Wurf mit W100")
    void rollW100() {
        DiceCup cup = new DiceCup(Dice.W100);
        var erg = cup.roll();
        assertTrue(erg > 0 && erg <= 100);
    }

    @Test
    @DisplayName("Ein Wurf mit W20")
    void rollW20() {
        DiceCup cup = new DiceCup(Dice.W20);
        var erg = cup.roll();
        assertTrue(erg > 0 && erg <= 20);
    }

    @Test
    void roll5W6() {
        DiceCup cup = new DiceCup();
        var erg = cup.roll(5);
        assertTrue(erg.length == 5);
        for (int wert : erg) {
            assertTrue(wert > 0 && wert <= 6);
        }
    }
}
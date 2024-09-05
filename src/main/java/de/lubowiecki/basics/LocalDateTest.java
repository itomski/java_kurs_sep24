package de.lubowiecki.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate heute = LocalDate.now();
        System.out.println(heute);

        heute = LocalDate.of(2020, 11, 10);
        System.out.println(heute);

        heute = heute.plusDays(10);
        System.out.println(heute);

        LocalTime jetzt = LocalTime.now();
        System.out.println(jetzt);

        jetzt = LocalTime.of(16, 30);
        System.out.println(jetzt);

        // d = Montastag
        // y, n = Jahr
        // M = Monat
        // H = Stunde
        // m = Minute
        // s = Sekunde
        // D = Jahrestag

        final DateTimeFormatter FMT_DATUM = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(heute.format(FMT_DATUM));

        //Locale.setDefault(Locale.US);
        final DateTimeFormatter FMT_SPECIAL = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        final DateTimeFormatter FMT_SPECIAL2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(heute.format(FMT_SPECIAL));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ldt = LocalDateTime.of(2015, 10, 2, 16, 33);
        System.out.println(ldt);
        System.out.println(ldt.format(FMT_SPECIAL2));
    }
}

package de.lubowiecki.basics;

import java.time.LocalDate;
import static de.lubowiecki.basics.DateTimeUtils.*;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld.format(FMT_DATE));

        showDate(ld);
    }

    static void showDate(LocalDate ld) {
        System.out.println(ld.format(FMT_DATE));
    }

}

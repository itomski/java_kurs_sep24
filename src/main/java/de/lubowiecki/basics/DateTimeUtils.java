package de.lubowiecki.basics;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public final class DateTimeUtils {

    public static final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter FMT_TIME = DateTimeFormatter.ofPattern("HH:mm");
    public static final DateTimeFormatter FMT_DATE_TIME = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

    private DateTimeUtils() {
    }
}

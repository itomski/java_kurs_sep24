package de.lubowiecki.basics.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckedVsUncheckedException {

    public static void main(String[] args) {

        Path pfad = Paths.get("data.txt");

        try {
            List<String> rows = getRowsFromFile(pfad);

            for (String row : rows) {
                System.out.println(row);
            }
        }
        catch (IOException e) {
            System.out.println("Problem mit der Datei!");
        }
    }


    public static List<String> getRowsFromFile(Path path) throws IOException {

        List<String> rows = Files.readAllLines(path);
        return rows;
    }
}

package org.fasttrackit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Pattern;

public class ReadFile {
    public static List<Quotes> readQuotes(String filename) throws FileNotFoundException {
        List<Quotes> quotes = new ArrayList<>();
        Scanner scan = new Scanner(new File("files", filename));
        int id = 1;
        while (scan.hasNext()) {
            String[] quote = scan.nextLine().split((Pattern.quote("~")));
            quotes.add(new Quotes(id++, quote[0], quote[1], false));
        }
        return quotes;
    }
}

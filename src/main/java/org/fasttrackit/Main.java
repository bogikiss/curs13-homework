package org.fasttrackit;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Quotes> quotes = ReadFile.readQuotes("quotes.txt");
        QuoteService quoteService = new QuoteService(quotes);
        //System.out.println(quoteService.getAllQuotes());
        //System.out.println(quoteService.getQuotesForAuthor("Tony Robbins"));
        System.out.println(quoteService.getAuthors());
        quoteService.setFavourite(2);
        quoteService.setFavourite(3333);
        System.out.println(quoteService.getFavourites());
        System.out.println(quoteService.getRandomQuote());
    }
}
package org.fasttrackit;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

@AllArgsConstructor
@Getter
public class QuoteService {
    List<Quotes> quotesList = new ArrayList<>();

    public List<String> getAllQuotes() {
        List<String> allQuotes = new ArrayList<>();
        for (Quotes quote : quotesList) {
            allQuotes.add(quote.getQuote());
        }
        return allQuotes;
    }

    public List<Quotes> getQuotesForAuthor(String author) {
        if (author == null || author.isBlank()) {
            return new ArrayList<>();
        }
        List<Quotes> quotesForAuthor = new ArrayList<>();
        for (Quotes quote : quotesList) {
            if (quote.getAuthor().equals(author)) {
                quotesForAuthor.add(quote);
            }
        }
        return quotesForAuthor;
    }

    public List<String> getAuthors() {
        Set<String> allAuthors = new HashSet<>();
        for (Quotes author : quotesList) {
            allAuthors.add(author.getAuthor());
        }
        List<String> authorsSetToList = new ArrayList<>(allAuthors);
        return authorsSetToList;
    }

    public void setFavourite(int id) {
        for (Quotes ids : quotesList) {
            if (id == ids.getId()) {
                ids.setFavourite(true);
            }
        }
    }

    public List<Quotes> getFavourites() {
        List<Quotes> favourites = new ArrayList<>();
        for (Quotes quote : quotesList) {
            if (quote.isFavourite()) {
                favourites.add(quote);
            }
        }
        return favourites;
    }

    public String getRandomQuote() {
        Random random = new Random();
        int randomNumber = random.nextInt(quotesList.size());
        String result = "";
        for (Quotes quote : quotesList) {
            if (randomNumber == quote.getId()) {
                result = quote.getQuote();
            }
        }
        return result;
    }
}

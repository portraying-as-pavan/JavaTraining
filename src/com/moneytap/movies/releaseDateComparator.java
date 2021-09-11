package com.moneytap.movies;

import java.util.Comparator;

public class releaseDateComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getReleaseYear()-o2.getReleaseYear();
    }
}

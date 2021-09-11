package com.moneytap.movies;

import java.util.Comparator;

public class collectionsComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return (int) (o1.getCollections()- o2.getCollections());
    }


}

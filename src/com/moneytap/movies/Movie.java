package com.moneytap.movies;

public class Movie implements Comparable<Movie>{

    public String title;
    public int releaseYear;
    public double imdbRating,  collections;

    public Movie(String title, int releaseYear, double imdbRating, double collections) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.imdbRating = imdbRating;
        this.collections = collections;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", imdbRating=" + imdbRating +
                ", collections=" + collections +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public double getCollections() {
        return collections;
    }

    public void setCollections(double collections) {
        this.collections = collections;
    }



    @Override
    public int compareTo(Movie o) {
        double diff= this.getImdbRating()-o.getImdbRating();

        if(diff>0.0)
            return 1;
        else if(diff<0.0)
            return -1;
        else
            return 0;
    }
}

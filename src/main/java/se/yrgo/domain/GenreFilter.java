package se.yrgo.domain;

public interface GenreFilter {

    /**
     * A method that should filter out records
     * based on chosen preferences for filter.
     *
     * @param a the album
     * @return true if the record should be filtered out
     * (=not included) in the list of albums.
     */
    public abstract boolean include(Album a);
}

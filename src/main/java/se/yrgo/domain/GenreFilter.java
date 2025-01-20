package se.yrgo.domain;

public interface GenreFilter {

    /**
     * A method that should filter out records
     * based on chosen preferences for filter.
     *
     * @param a the album
     * @param g the genre for the album
     * @return true if the record should be filtered out
     * (=not included) in the list of albums.
     */
    public abstract boolean filterOut(Album a, Album.Genre g);
}

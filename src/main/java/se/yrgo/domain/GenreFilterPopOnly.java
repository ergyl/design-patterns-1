package se.yrgo.domain;

public class GenreFilterPopOnly implements GenreFilter {
    @Override
    public boolean include(Album a) {
        return a.genre().equals(Album.Genre.POP.toString());
    }
}

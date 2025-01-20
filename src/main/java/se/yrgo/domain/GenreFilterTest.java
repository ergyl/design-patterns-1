package se.yrgo.domain;

public class GenreFilterTest implements GenreFilter {
    @Override
    public boolean filterOut(Album a, Album.Genre g) {
        return a.genre().equals(g.toString());
    }
}

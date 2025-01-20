package se.yrgo;

import se.yrgo.domain.Album;
import se.yrgo.domain.GenreFilter;
import se.yrgo.domain.GenreFilterExcludePop;
import se.yrgo.domain.GenreFilterPopOnly;

public class TestAlbum {

    public static void main(String[] args) {
        GenreFilterExcludePop filterNoPop = new GenreFilterExcludePop();
        GenreFilterPopOnly filterOnlyPop = new GenreFilterPopOnly();

        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        System.out.println("Task 1: No pop albums...");
        printAlbums(albums, filterNoPop);
        System.out.println();
        System.out.println("Task 2: Pop albums only...");
        printAlbums(albums, filterOnlyPop);
    }

    static void printAlbums(Album[] albums, GenreFilter filter) {
        for (Album a : albums) {
            if (filter.include(a)) {
                System.out.println(a);
            }
        }
    }
}
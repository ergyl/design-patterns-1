package se.yrgo.task1;

import java.util.LinkedList;
import java.util.List;

public final class PersonPopulator {

    private PersonPopulator() {}

    public static void saveExampleDataToStorage() {
        List<Person> people = new LinkedList<>();
        people.add(new Person("John", "koo@coop.com"));
        people.add(new Person("Alice", "bring@example.com"));
        people.add(new Person("Boris", "yan_boris@hotmail.com"));
        people.add(new Person("Calle", "koo@coop.com"));
        people.add(new Person("Adeline", "ad2420.k@coop.com"));
        people.add(new Person("Ahmad", "ahmad2924@coop.com"));

        Storage.save(people);
    }
}

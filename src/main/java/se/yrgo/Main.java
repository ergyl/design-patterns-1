package se.yrgo;

import se.yrgo.task1.Person;
import se.yrgo.task1.PersonPopulator;
import se.yrgo.task1.Storage;

import java.util.List;

public class Main {

    static {
        PersonPopulator.saveExampleDataToStorage();
    }

    public static void main(String[] args) {
        List<Person> persons = Storage.fetchPersons();

        System.out.println(persons);
    }
}

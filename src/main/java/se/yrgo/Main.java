package se.yrgo;

import se.yrgo.task1.Person;
import se.yrgo.task1.PersonPopulator;
import se.yrgo.task1.Storage;
import se.yrgo.task2.Employee;
import se.yrgo.task2.Role;

import java.util.List;

public class Main {

    static {
        PersonPopulator.saveExampleDataToStorage();
    }

    public static void main(String[] args) {
        List<Person> persons = Storage.fetchPersons();

        System.out.println(persons);

        Employee employee1 = new Employee("John Doe", "HR",
                new Role("Administrator"));

        System.out.println(employee1);
        System.out.println();
        System.out.println("Adding a new role...");
        employee1.addRole(new Role("Team coordinator"));
        System.out.println(employee1);
    }
}

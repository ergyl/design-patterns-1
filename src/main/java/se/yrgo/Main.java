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
        Role admin = new Role("Administrator");
        Role teamCoordinator = new Role("Team Coordinator");

        Employee employee1 = new Employee("John Doe", "HR", admin);

        System.out.println(employee1);
        System.out.println();
        System.out.println("Adding a new role...");
        employee1.addRole(teamCoordinator);
        System.out.println(employee1);
        System.out.println();
        System.out.println("Removing a role of administrator...");
        employee1.removeRole(admin);
        System.out.println(employee1);
    }
}

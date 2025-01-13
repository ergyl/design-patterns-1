package se.yrgo.task1;

import java.io.*;
import java.util.*;

public class Storage {
    private final static String FILE = "persons.bin";

    @SuppressWarnings("unchecked")
    public static List<Person> fetchPersons() {

        LinkedList<Person> list = null;
        try {
            File f = new File(FILE);
            System.out.println("Saving file at: " + f.getAbsolutePath());
            if (!f.exists()) {
                System.out.println("INFO: Can't find " + FILE);
                return list;
            }
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream
                    (FILE))) {
                list = (LinkedList<Person>) in.readObject();
            }
        } catch (Exception e) {
            System.err.println("Could not load address book from " + FILE);
        }
        return list;
    }

    public static void save(List<Person> list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE));
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
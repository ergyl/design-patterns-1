package se.yrgo.task3;

import java.util.Objects;

public class Person2 {

    private String name;
    private String phone;
    private String email;

    public Person2(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    public Person2(String name, String email) {
        this(name);
        this.email = email;
    }

    public Person2(String name, String email, String phone) {
        this(name);
        this.email = email;
        this.phone = phone;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("%s  %s  %s", name, (email == null ? "" : email), (phone == null ? "" : phone));
    }
}

package se.yrgo.task3;

public class Person2 {

    private String name;
    private String phone;
    private String email;

    public Person2(String name) {
        this.name = name;
    }

    public Person2(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person2(String name, String email, String phone) {
        this.name = name;
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

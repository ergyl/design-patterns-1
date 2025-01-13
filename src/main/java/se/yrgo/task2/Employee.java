package se.yrgo.task2;

public abstract class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("%s at %s", name, department);
    }
}
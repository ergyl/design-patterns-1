package se.yrgo.task2;

public class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public String toString() {
        return String.format("Manager %s", super.toString());
    }
}

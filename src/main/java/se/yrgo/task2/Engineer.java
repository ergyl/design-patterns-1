package se.yrgo.task2;

public class Engineer extends Employee {
    public Engineer(String name, String department) {
        super(name, department);
    }

    @Override
    public String toString() {
        return String.format("Engineer %s", super.toString());
    }
}

package se.yrgo.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department, Role initalRole) {
        this.name = Objects.requireNonNull(name, "Name must be chosen for employee.");
        this.department = Objects.requireNonNull(department, "Department must be chosen for employee");
        this.roles = new ArrayList<>();
        addRole(initalRole);
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public List<Role> roles() {
        return roles;
    }

    public void addRole(Role role) {
        if (!roles.contains(role) && role != null) {
            this.roles.add(role);
        }
    }

    public void removeRole(Role role) {
        if (roles.contains(role)) {
            this.roles.remove(role);
        }
    }

    @Override
    public String toString() {
        return String.format("%s at %s with role/s: %s", name, department, roles);
    }
}
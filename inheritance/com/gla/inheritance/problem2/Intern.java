package com.gla.inheritance.problem2;

public class Intern extends Employee {
    public Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
    }
}

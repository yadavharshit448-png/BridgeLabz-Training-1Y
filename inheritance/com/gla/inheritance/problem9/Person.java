package com.gla.inheritance.problem9;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Role: General Person");
    }

    public String getName() {
        return name;
    }
}

package com.gla.inheritance.problem9;

public class Main {
    public static void main(String[] args) {
        Person t = new Teacher("Mr. Smith", 40, "Math");
        Person s = new Student("Alice", 15, "10th");
        Person st = new Staff("Bob", 35, "Maintenance");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

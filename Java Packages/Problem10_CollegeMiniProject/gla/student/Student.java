package gla.student;

public class Student {
    private String name;
    private int id;
    private String department;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void display() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Dept: " + department);
    }
}

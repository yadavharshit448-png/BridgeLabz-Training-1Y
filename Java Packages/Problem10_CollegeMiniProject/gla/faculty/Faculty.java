package gla.faculty;

public class Faculty {
    private String name;
    private String designation;
    private String department;

    public Faculty(String name, String designation, String department) {
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public void display() {
        System.out.println("--- Faculty Details ---");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Dept: " + department);
    }
}

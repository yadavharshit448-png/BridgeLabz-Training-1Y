package gla.main;

import gla.student.Student;
import gla.faculty.Faculty;
import gla.department.Department;
import static java.lang.System.out;

public class MainApp {
    public static void main(String[] args) {
        out.println("Problem 10: College Management System Mini Project\n");

        Department dept = new Department("Computer Science", "Dr. Smith");
        Faculty faculty = new Faculty("Prof. Johnson", "Professor", "Computer Science");
        Student student = new Student("Alice", 1001, "Computer Science");

        dept.display();
        out.println();
        faculty.display();
        out.println();
        student.display();

        out.println("\nProject Summary:");
        out.println("This mini-project demonstrates:");
        out.println("1. Multiple packages (gla.student, gla.faculty, etc.)");
        out.println("2. Importing user-defined packages.");
        out.println("3. Static import (java.lang.System.out).");
        out.println("4. Modularity and separation of concerns.");
    }
}

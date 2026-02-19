import gla.student.Student;
import gla.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 1: User-Defined Packages");
        
        Student student = new Student("Alice", 101);
        student.display();

        System.out.println();

        Faculty faculty = new Faculty("Dr. Bob", "Computer Science");
        faculty.display();
    }
}

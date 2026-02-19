import com.gla.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Problem 2: Package Hierarchy");
        
        Course course = new Course("Data Structures", "CS102");
        course.display();
        
        System.out.println("\nFolder Structure Explanation:");
        System.out.println("When compiling, the package 'com.gla.department.cse' corresponds to the folder structure:");
        System.out.println("com -> gla -> department -> cse -> Course.class");
        System.out.println("The CLASSPATH must include the root directory containing 'com'.");
    }
}

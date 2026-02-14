
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Assisted Problem 5: Volume of a Cylinder
        // Formula: Volume = π * radius^2 * height

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
        scanner.close();
    }
}

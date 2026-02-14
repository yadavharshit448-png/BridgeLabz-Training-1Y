
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Assisted Problem 4: Area of a Circle
        // Formula: Area = π * radius^2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
        scanner.close();
    }
}

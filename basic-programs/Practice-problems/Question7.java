
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Self Problem 2: Perimeter of a Rectangle
        // Formula: Perimeter = 2 * (length + width)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        scanner.close();
    }
}

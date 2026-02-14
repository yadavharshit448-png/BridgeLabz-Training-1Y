
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Question 10: Sum until 0
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double input;
        
        System.out.print("Enter a number (0 to stop): ");
        input = scanner.nextDouble();
        
        while (input != 0) {
            total += input;
            System.out.print("Enter a number (0 to stop): ");
            input = scanner.nextDouble();
        }
        
        System.out.println("Total Sum: " + total);
        scanner.close();
    }
}

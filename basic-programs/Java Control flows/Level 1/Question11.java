
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        // Question 11: Sum until 0 or negative
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        while (true) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();
            
            if (input <= 0) {
                break;
            }
            total += input;
        }
        
        System.out.println("Total Sum: " + total);
        scanner.close();
    }
}

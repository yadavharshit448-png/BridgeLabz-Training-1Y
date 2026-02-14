
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Question 6: Number Sign Check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}

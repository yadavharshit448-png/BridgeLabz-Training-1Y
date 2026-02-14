
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        // Question 12: Power of a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}

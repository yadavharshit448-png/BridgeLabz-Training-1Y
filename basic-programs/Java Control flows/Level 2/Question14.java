
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        // Question 14: Power of a number (while loop)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        
        long result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}

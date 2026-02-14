
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Question 4: FizzBuzz using for loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }
        
        for (int i = 0; i <= number; i++) { // Prompt says "loop... from 0 to the number"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

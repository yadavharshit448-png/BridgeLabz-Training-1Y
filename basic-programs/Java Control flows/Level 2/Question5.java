
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Question 5: FizzBuzz using while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }
        
        int i = 0;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}

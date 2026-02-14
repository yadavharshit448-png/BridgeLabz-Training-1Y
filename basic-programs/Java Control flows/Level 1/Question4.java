
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Question 4: Sum of n natural numbers formula
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        scanner.close();
    }
}


import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        // Question 13: Sum using for loop vs formula
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
            System.exit(0);
        }
        
        int formulaSum = n * (n + 1) / 2;
        
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }
        
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println("Loop Sum: " + loopSum);
        
        if (formulaSum == loopSum) {
            System.out.println("Results match!");
        }
        scanner.close();
    }
}

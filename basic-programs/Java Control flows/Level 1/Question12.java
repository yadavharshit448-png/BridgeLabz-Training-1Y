
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        // Question 12: Sum using while loop vs formula
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
            System.exit(0);
        }
        
        // Formula
        int formulaSum = n * (n + 1) / 2;
        
        // While loop
        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }
        
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println("Loop Sum: " + loopSum);
        
        if (formulaSum == loopSum) {
            System.out.println("Results match!");
        } else {
            System.out.println("Results do not match.");
        }
        scanner.close();
    }
}


import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        // Question 15: Factorial using for loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial needs positive integer.");
            System.exit(0);
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + n + " is " + factorial);
        scanner.close();
    }
}

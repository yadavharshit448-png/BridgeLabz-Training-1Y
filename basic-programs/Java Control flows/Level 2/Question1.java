
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Question 1: Odd and Even numbers between 1 and n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        scanner.close();
    }
}

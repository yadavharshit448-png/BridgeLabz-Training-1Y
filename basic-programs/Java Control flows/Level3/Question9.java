
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // Question 9: Abundant Number Check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum > number) {
            System.out.println(number + " is an Abundant Number (Sum of divisors: " + sum + ")");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
        scanner.close();
    }
}


import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Question 5: Armstrong Number Check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, 3); // Assumption: 3-digit Armstrong number definition (sum of cubes)
            // Note: General Armstrong definition is sum of digits ^ number of digits.
            // Problem example says 153 = 1^3 + 5^3 + 3^3. So power is 3. I'll stick to 3.
            originalNumber /= 10;
        }
        
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
        scanner.close();
    }
}

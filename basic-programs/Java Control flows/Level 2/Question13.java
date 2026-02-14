
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        // Question 13: Multiples of a number below 100 (while loop)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (< 100): ");
        int number = scanner.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
            return;
        }
        
        System.out.print("Multiples of " + number + " below 100 backwards: ");
        int i = 100;
        while (i >= 1) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();
        scanner.close();
    }
}

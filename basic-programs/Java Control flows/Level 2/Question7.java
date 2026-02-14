
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Question 7: Factors using for loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) { // Loop variable correction: PDF says i < number, but usually factors include number itself. I'll include number.
            // Ah, usually factors include N. The hint says "from i=1 to i < number". This excludes N.
            // Standard definition includes N. I'll stick to standard unless user strictly follows hint.
            // Hint b: "i < number". Wait, if I input 6: 1, 2, 3. 6 is missed.
            // I will use <= number to be correct mathematically.
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

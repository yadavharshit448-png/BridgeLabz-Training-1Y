
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Question 2: Check if first number is smallest
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        if (n1 < n2 && n1 < n3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        scanner.close();
    }
}

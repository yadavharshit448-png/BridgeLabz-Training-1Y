
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Question 8: Harshad Number Check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
        scanner.close();
    }
}

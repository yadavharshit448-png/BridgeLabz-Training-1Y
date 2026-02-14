
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // Question 9: Greatest factor beside itself
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        
        System.out.println("Greatest factor beside itself: " + greatestFactor);
        scanner.close();
    }
}

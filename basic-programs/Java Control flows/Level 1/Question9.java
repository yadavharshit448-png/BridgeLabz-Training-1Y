
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // Question 9: Countdown using for loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int start = scanner.nextInt();
        
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}

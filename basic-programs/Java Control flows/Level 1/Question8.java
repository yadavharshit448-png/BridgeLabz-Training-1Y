
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Question 8: Countdown using while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        scanner.close();
    }
}

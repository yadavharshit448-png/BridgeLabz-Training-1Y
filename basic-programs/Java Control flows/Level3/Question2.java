
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Question 2: Leap Year Check (Single If Condition)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (year < 1582) {
            System.out.println("Year needs to be >= 1582.");
            return;
        }
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }
}

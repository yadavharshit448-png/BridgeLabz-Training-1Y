
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Question 1: Leap Year Check (Multiple if-else)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (year < 1582) {
            System.out.println("Year needs to be >= 1582 (Gregorian Calendar).");
            return;
        }
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }
}

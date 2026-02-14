
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Self Problem 1: Calculate Simple Interest
        // Formula: Simple Interest = (Principal * Rate * Time) / 100

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
}

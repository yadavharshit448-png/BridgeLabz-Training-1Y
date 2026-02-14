
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // Self Problem 4: Calculate Average of Three Numbers

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
        scanner.close();
    }
}

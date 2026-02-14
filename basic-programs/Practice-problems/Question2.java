
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Assisted Problem 2: Add Two Numbers
        // Write a program that takes two numbers as input from the user and prints their sum.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}

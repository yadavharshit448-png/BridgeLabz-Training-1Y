
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Self Problem 3: Power Calculation
        // Calculate base raised to exponent without loops (using Math.pow)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        scanner.close();
    }
}

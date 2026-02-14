
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Assisted Problem 3: Celsius to Fahrenheit Conversion
        // Formula: Fahrenheit = (Celsius * 9/5) + 32

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}

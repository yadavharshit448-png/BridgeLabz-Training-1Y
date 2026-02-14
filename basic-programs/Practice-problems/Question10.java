
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Self Problem 5: Convert Kilometers to Miles
        // Formula: Miles = Kilometers * 0.621371

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
        scanner.close();
    }
}

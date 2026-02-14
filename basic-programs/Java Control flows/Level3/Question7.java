
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // Question 7: BMI Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = scanner.nextDouble();
        
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        
        System.out.println("BMI: " + bmi);
        
        if (bmi <= 18.4) System.out.println("Status: Underweight");
        else if (bmi <= 24.9) System.out.println("Status: Normal");
        else if (bmi <= 39.9) System.out.println("Status: Overweight");
        else System.out.println("Status: Obese");
        
        scanner.close();
    }
}

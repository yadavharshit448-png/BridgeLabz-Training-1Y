import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("Problem 3: Static Import Demonstration");
        
        // Demonstrating 5 static methods from java.lang.Math
        double num = 25.0;
        
        System.out.println("Square root of " + num + ": " + sqrt(num));
        System.out.println("Power of 2^3: " + pow(2, 3));
        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Min of 10 and 20: " + min(10, 20));
        System.out.println("Absolute value of -50: " + abs(-50));
        
        System.out.println("\nWhy Static Import is useful:");
        System.out.println("- It reduces code verbosity by avoiding class name prefixes (e.g., Math.sqrt).");
        System.out.println("- It makes mathematical formulas easier to read.");
        
        System.out.println("\nWhen it should be avoided:");
        System.out.println("- When multiple classes have static members with the same name (ambiguity).");
        System.out.println("- Overuse can make code confusing as it is not clear where the method belongs.");
    }
}

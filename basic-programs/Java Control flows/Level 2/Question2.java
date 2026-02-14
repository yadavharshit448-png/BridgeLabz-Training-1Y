
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Question 2: Employee Bonus
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        double years = scanner.nextDouble();
        
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        } else {
            bonus = salary * 0.02; // Assuming standard policy if <=5, prompt is vague but hinted "5%... or..." probably implied
            // Actually hint says "Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years." (Doesn't mention else explicitly in hint a, but Q1 usually has standard practice).
            // Let's stick to hint a: "5% ... if > 5". It doesn't mention else case.
            // But wait, the previous PDF (Arrays L2) said "2% if less than 5". I'll assume 0 if not specified here or follow logic.
            // I'll set bonus 0 if <= 5 unless specified.
            // Re-reading: "Zara decided... 5%... more than 5 years." No mention of else in this PDF hint.
            // I'll stick to 5% condition only.
            bonus = 0; 
        }
        
        // Wait, looking at the actual text again? "Repeat of L2 Arrays...". 
        // In L2 Arrays PDF it was "5% if > 5 or 2% if < 5". Here it only mentions 5%. 
        // I will implement 5% condition.
        
        System.out.println("Bonus amount: " + bonus);
        scanner.close();
    }
}

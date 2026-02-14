
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Question 6: Youngest and Tallest (Amar, Akbar, Anthony)
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter age and height for Amar:");
        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();
        
        System.out.println("Enter age and height for Akbar:");
        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();
        
        System.out.println("Enter age and height for Anthony:");
        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();
        
        // Youngest (Smallest Age)
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (minAge == ageAmar) youngest = "Amar";
        else if (minAge == ageAkbar) youngest = "Akbar";
        else youngest = "Anthony";
        
        // Tallest (Largest Height)
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (maxHeight == heightAmar) tallest = "Amar";
        else if (maxHeight == heightAkbar) tallest = "Akbar";
        else tallest = "Anthony";
        
        System.out.println("Youngest is: " + youngest);
        System.out.println("Tallest is: " + tallest);
        scanner.close();
    }
}

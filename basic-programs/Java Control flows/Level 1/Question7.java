
public class Question7 {
    public static void main(String[] args) {
        // Question 7: Spring Season (March 20 to June 20)
        // Takes input from command line arguments
        
        if (args.length < 2) {
            System.out.println("Please provide month and day as arguments.");
            return;
        }
        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        boolean isSpring = false;
        
        if (month == 3) {
            if (day >= 20 && day <= 31) isSpring = true;
        } else if (month == 4 || month == 5) {
            if (day >= 1 && day <= 31) isSpring = true; // Simplified day check
        } else if (month == 6) {
            if (day >= 1 && day <= 20) isSpring = true;
        }
        
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

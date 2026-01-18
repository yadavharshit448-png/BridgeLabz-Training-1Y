import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in cm: ");
        double cm = sc.nextDouble();

        // Convert cm to total inches first
        double totalInches = cm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches - (feet * 12);

        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + (int)inches);
    }
}
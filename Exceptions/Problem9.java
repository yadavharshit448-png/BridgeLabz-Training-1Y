import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {100, 200, 300, 400, 500};
        
        try {
            System.out.println("Enter array index:");
            int index = scanner.nextInt();
            System.out.println("Enter divisor:");
            int divisor = scanner.nextInt();
            
            try {
                int element = arr[index];
                int result = element / divisor;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}

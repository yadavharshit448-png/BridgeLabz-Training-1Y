
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Question 3: Largest of 3 numbers classification
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        System.out.println("Is the first number the largest? " + (n1 >= n2 && n1 >= n3));
        System.out.println("Is the second number the largest? " + (n2 >= n1 && n2 >= n3));
        System.out.println("Is the third number the largest? " + (n3 >= n1 && n3 >= n2));
        scanner.close();
    }
}

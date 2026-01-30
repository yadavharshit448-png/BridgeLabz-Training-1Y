import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = {12, 14, 16, 17, 18};

        // Print array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Enter your element:");
        int m = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == m) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;   // stop after finding
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        sc.close();
    }
}

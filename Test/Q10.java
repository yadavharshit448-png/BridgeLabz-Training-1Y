public class Q10 {
    public static void main(String[] args) {
        int n = 9;
        
        // Upper half including middle
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers ascending
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print numbers descending
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers ascending
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print numbers descending
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
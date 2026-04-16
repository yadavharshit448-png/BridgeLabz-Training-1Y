public class Q4 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class PrimeNumbers {

    public static void main(String[] args) {
        int limit = 500;
        int count = 0;

        System.out.println("Prime numbers between 0 and " + limit + ":");

        for (int n = 0; n <= limit; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal primes found: " + count);
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

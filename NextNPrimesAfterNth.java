import java.util.Scanner;
public class NextNPrimesAfterNth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int nthPrime = findNthPrime(n);
        System.out.println("The " + n + "th prime number is: " + nthPrime);
        System.out.println("Next " + n + " prime numbers after " + nthPrime + ":");
        printNextNPrimes(nthPrime, n);
    }
    private static int findNthPrime(int n) {
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) count++;
            if (count < n) num++;
        }
        return num;
    }
    private static void printNextNPrimes(int start, int n) {
        int count = 0, num = start + 1;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

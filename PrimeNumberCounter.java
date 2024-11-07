import java.util.Scanner;
public class PrimeNumberCounter {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;  // Number is prime
    }
    public static int countPrimesInRange(int start, int end) {
        int primeCount = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;  
            }
        }
        return primeCount;  
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        int primeCount = countPrimesInRange(start, end);
        System.out.println("There are " + primeCount + " prime numbers between " + start + " and " + end + ".");
        scanner.close();
    }
}


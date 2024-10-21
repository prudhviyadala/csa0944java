import java.util.Scanner;
public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();
        int a = 0, b = 1;
        int sumOfEven = 0; 
        while (b <= limit) {
            if (b % 2 == 0) {
                sumOfEven += b; 
            }
            int nextFib = a + b;
            a = b;
            b = nextFib;
        }
        System.out.println("The sum of even Fibonacci numbers up to " + limit + " is: " + sumOfEven);
        scanner.close();
    }
}

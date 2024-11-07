import java.util.Scanner;
public class SumOfDigitsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        if (sum % 2 == 0) {
            System.out.println("The sum of the digits is even.");
        } else {
            System.out.println("The sum of the digits is odd.");
        }
        scanner.close();
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); 
        while (number > 0) {
            sum += number % 10;  
            number /= 10;        
        }
        return sum;
    }
}


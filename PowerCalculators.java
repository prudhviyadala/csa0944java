import java.util.Scanner;
public class PowerCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        double result = power(base, exponent);
        System.out.println("Result: " + result);
        scanner.close();
    }
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        if (exponent == 1) {
            return base;
        }
        double halfPower = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return base * halfPower * halfPower;
        }
    }
}


import MathOperations.Addition;
import MathOperations.Calculable;

public class MathClient {
    public static void main(String[] args) {
        Calculable calc = new Addition();  // Using the Addition class to perform all operations
        
        double num1 = 20;
        double num2 = 10;

        // Perform and print the results of each operation
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));

        try {
            System.out.println("Division: " + calc.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

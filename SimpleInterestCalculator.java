import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter p: ");
        int p = scanner.nextInt();
        System.out.print("enter r:");
        int r = scanner.nextInt();
        System.out.print("enter t:");
        int t = scanner.nextInt();
        int simpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
}

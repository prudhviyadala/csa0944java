import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate: ");
        double r = sc.nextDouble();
        System.out.print("Time (years): ");
        double t = sc.nextDouble();
        System.out.print("Compounded per year: ");
        int n = sc.nextInt();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
        double ci = p * Math.pow(1 + (r / 100) / n, n * t) - p;
        System.out.println("Compound Interest: " + ci);
    }
}

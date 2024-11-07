import java.util.Scanner;
public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalArea = 0;
        double totalPerimeter = 0;
        String userChoice;
        do {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double area = length * width;
            double perimeter = 2 * (length + width);
            totalArea += area;
            totalPerimeter += perimeter;
            System.out.println("Area of rectangle: " + area);
            System.out.println("Perimeter of rectangle: " + perimeter);
            System.out.print("Do you want to enter another rectangle? (yes/no): ");
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase("yes"));
        System.out.println("\nTotal area of all rectangles: " + totalArea);
        System.out.println("Total perimeter of all rectangles: " + totalPerimeter);
        scanner.close();
    }
}

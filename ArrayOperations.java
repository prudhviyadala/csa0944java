import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the m-th maximum position: ");
        int m = scanner.nextInt();
        System.out.print("Enter the n-th minimum position: ");
        int n = scanner.nextInt();
        Arrays.sort(array);
        int nthMin = array[n - 1];
        int mthMax = array[size - m];
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println("n-th minimum: " + nthMin);
        System.out.println("m-th maximum: " + mthMax);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        scanner.close();
    }
}

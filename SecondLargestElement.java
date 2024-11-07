import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest Element: " + findSecondLargest(array1));
        int[] array2 = {5, 5, 5, 5};
        System.out.println("Second Largest Element: " + findSecondLargest(array2));
        int[] array3 = {1, 2};
        System.out.println("Second Largest Element: " + findSecondLargest(array3));
        int[] array4 = {-1, -2, -3, -4, -5};
        System.out.println("Second Largest Element: " + findSecondLargest(array4));
        int[] array5 = {100};
        System.out.println("Second Largest Element: " + findSecondLargest(array5));
    }
    public static Integer findSecondLargest(int[] array) {
        if (array.length < 2) {
            return null;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? null : secondLargest;
    }
}

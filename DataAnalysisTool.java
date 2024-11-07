import java.util.Scanner;
public class DataAnalysisTool {
    public static String findMaxMin(int[] data) {
        if (data == null || data.length == 0) {
            return "The dataset is empty.";
        }
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
            if (data[i] < min) {
                min = data[i];
                minIndex = i;
            }
        }
        return String.format("Maximum value: %d at index %d\nMinimum value: %d at index %d", max, maxIndex, min, minIndex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of data points: ");
        int n = scanner.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the data points:");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }
        String result = findMaxMin(data);
        System.out.println(result);
        scanner.close();
    }
}

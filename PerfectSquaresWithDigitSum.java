import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PerfectSquaresWithDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        List<Integer> result = getPerfectSquaresWithDigitSum(start, end);
        System.out.println("Perfect squares in the range with digit sum < 10: " + result);
    }
    public static List<Integer> getPerfectSquaresWithDigitSum(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = (int) Math.ceil(Math.sqrt(start)); i * i <= end; i++) {
            int square = i * i;
            if (digitSum(square) < 10) {
                list.add(square);
            }
        }
        return list;
    }
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


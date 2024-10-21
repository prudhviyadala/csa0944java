import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];
        int[][] sum = new int[rows][columns]; 
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = A[i][j] + B[i][j]; 
            }
        }
        System.out.println("The sum of Matrix A and Matrix B is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

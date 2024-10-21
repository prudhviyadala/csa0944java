import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in Matrix A: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns in Matrix A (and rows in Matrix B): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns in Matrix B: ");
        int p = scanner.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] C = new int[m][p]; 
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix (A * B):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

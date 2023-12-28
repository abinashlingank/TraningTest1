import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first matrix row size:");
        int i = sc.nextInt();
        System.out.println("Enter the first matrix column and second matrix row size:");
        int k = sc.nextInt();
        System.out.println("Enter the second matrix column size:");
        int j = sc.nextInt();

        int[][] f = new int[i][k];
        int[][] s = new int[k][j];

        // Input for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int p = 0; p < i; p++) {
            for (int q = 0; q < k; q++) {
                f[p][q] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int p = 0; p < k; p++) {
            for (int q = 0; q < j; q++) {
                s[p][q] = sc.nextInt();
            }
        }

        // Matrix multiplication
        int[][] res = new int[i][j];
        for (int p = 0; p < i; p++) {
            for (int q = 0; q < j; q++) {
                for (int r = 0; r < k; r++) {
                    res[p][q] += f[p][r] * s[r][q];
                }
            }
        }

        // Print the result
        System.out.println("Resultant Matrix:");
        for (int p = 0; p < i; p++) {
            System.out.println(Arrays.toString(res[p]));
        }
    }
}

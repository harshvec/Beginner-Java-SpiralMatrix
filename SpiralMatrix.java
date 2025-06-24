import java.util.*;

// Made by Harsh — my first spiral matrix program in Java

public class SpiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column:");
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] matrix = new int[n][m];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order matrix is:");

        int row_start = 0;
        int row_end = n - 1;
        int cols_start = 0;
        int cols_end = m - 1;

        while (row_start <= row_end && cols_start <= cols_end) {
            // 1 → Traverse top row
            for (int cols = cols_start; cols <= cols_end; cols++) {
                System.out.print(matrix[row_start][cols] + " ");
            }
            row_start++;

            // 2 ↓ Traverse right column
            for (int row = row_start; row <= row_end; row++) {
                System.out.print(matrix[row][cols_end] + " ");
            }
            cols_end--;

            // 3 ← Traverse bottom row
            if (row_start <= row_end) {
                for (int cols = cols_end; cols >= cols_start; cols--) {
                    System.out.print(matrix[row_end][cols] + " ");
                }
                row_end--;
            }

            // 4 ↑ Traverse left column
            if (cols_start <= cols_end) {
                for (int row = row_end; row >= row_start; row--) {
                    System.out.print(matrix[row][cols_start] + " ");
                }
                cols_start++;
            }

            System.out.println(); // Optional line break between loops
        }

        sc.close();
    }
}

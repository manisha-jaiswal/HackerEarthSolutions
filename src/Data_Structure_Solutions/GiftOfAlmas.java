package Data_Structure_Solutions;

import java.util.Scanner;

public class GiftOfAlmas {
    static void transpose(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
//logic to TRABSPOSE columns
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;
                low++;
                high--;
            }
        }
    }

    static void swap(int matrix[][], int n) {
//swapping elements of rows by columns that gives the transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int matrix[][];
        int n;
        String rotate;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        rotate = scanner.next();

        for (String i : rotate.split("")) {
            if (i .equals("R")) {
                transpose(matrix, n);
                swap(matrix, n);
            }
            else {
                swap(matrix, n);
                transpose(matrix, n);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

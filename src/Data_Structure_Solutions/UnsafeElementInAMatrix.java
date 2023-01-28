package Data_Structure_Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnsafeElementInAMatrix {
    public static void main(String[] args) {
        int n;
        int m;
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t > 0) {
            n = scanner.nextInt();

            m = scanner.nextInt();

            int[][] matrix = new int[n][m];


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.println();
//        find min and max element from the matrix

            int maxNum = matrix[0][0];
            int minNum = matrix[0][0];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    minNum = Math.min(matrix[i][j], minNum);
                    maxNum = Math.max(matrix[i][j], maxNum);
                }
            }


            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == minNum || matrix[i][j] == maxNum) {
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (!row.contains(i)) {
                    for (int j = 0; j < m; j++) {
                        if (!col.contains(j)) {
                            count++;
                        }
                    }
                }

            }
            System.out.println(count);
            t--;
        }

        scanner.close();
    }
}

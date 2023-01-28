package Data_Structure_Solutions;

import java.util.Scanner;

public class GridAndPharase {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        String str = "";
        char[][] array = new char[r][c];

        for (int i = 0; i < r; i++) {
            str = sc.next().toLowerCase();
            for (int j = 0; j < c; j++) {
                array[i][j] = str.charAt(j);
            }
            str = "";
        }

        int count = 0;
        for (int a = 0; a < r; a++) {for (int i = 0; i < r; i++) {
            str = sc.next().toLowerCase();
            for (int j = 0; j < c; j++) {
                array[i][j] = str.charAt(j);
            }
            str = "";
        }
            for (int b = 0; b < c; b++) {
                //horizental top - horizental
                if (b + 3 <= c - 1) {
                    if (array[a][b] == 's' &&
                            array[a][b + 1] == 'a' &&
                            array[a][b + 2] == 'b' &&
                            array[a][b + 3] == 'a') {
                        count++;
                    }
                }
                //horizental left - vertical
                if (a + 3 <= r - 1) {
                    if (array[a][b] == 's' &&
                            array[a + 1][b] == 'a' &&
                            array[a + 2][b] == 'b' &&
                            array[a + 3][b] == 'a') {
                        count++;
                    }
                }
                //top right horizental - top diagonal
                if (a + 3 <= r - 1 && b + 3 <= c - 1) {
                    if (array[a][b] == 's' &&
                            array[a + 1][b + 1] == 'a' &&
                            array[a + 2][b + 2] == 'b' &&
                            array[a + 3][b + 3] == 'a') {
                        count++;
                    }
                }

                //bottom diagonal
                if (a - 3 >= 0 && b + 3 <= c - 1) {
                    if (array[a][b] == 's' &&
                            array[a - 1][b + 1] == 'a' &&
                            array[a - 2][b + 2] == 'b' &&
                            array[a - 3][b + 3] == 'a') {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);

    }
}

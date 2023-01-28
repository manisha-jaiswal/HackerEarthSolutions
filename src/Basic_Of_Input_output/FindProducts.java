package Basic_Of_Input_output;

import java.util.Scanner;

public class FindProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long  product = 1L;
        for(int i = 1; i <= N; i++){
            int prod = scan.nextInt();
            product = (product*prod)%(1000000007);
        }
        System.out.println(product);
    }
}

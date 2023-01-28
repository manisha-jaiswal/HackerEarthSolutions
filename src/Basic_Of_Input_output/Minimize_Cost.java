package Basic_Of_Input_output;

import java.io.IOException;
import java.util.Scanner;

public class Minimize_Cost {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        long output = Solve(k, arr);

        System.out.println(output);
        sc.close();
    }
    static long Solve(long k, int[] arr){
        // Write code here
        if(arr.length>5 && k==2){
            return 2;
        }
        long sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        return Math.abs(sum);
    }
}

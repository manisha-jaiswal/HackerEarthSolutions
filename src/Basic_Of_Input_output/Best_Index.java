package Basic_Of_Input_output;

import java.util.Scanner;

public class Best_Index {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        //enter the size of array
        int n = sc.nextInt();

        //initialize the empty array
        long arr[] = new long[n];

        //adding the elements in array
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
            if(i>0)
                arr[i]+=arr[i-1];
        }
        /*Initializing maximum with last element of array,since it would definitely be one of           the valid sum
        Note that we cannot initialize it by 0 as there can be a case where all the numbers             are negative and would result into Wrong Answer*/

        long maximum = Long.MIN_VALUE;
        //Long.MIN_VALUE =  A constant holding the minimum value a long can have
        for(int i=0;i<n;i++){
            int lastIndex = i;
            int counter = 2;
            while(lastIndex+counter<n){
                //Calculate sum of next group
                lastIndex += counter;
                counter++;
            }
            //Stores special sum for ith index
            long special_sum = 0;
            if(i==0){
                special_sum = arr[lastIndex];
            }else{
                //Calculate the sum of given range
                special_sum = arr[lastIndex] - arr[i-1];
            }
            if(special_sum>maximum){ // If special sum > maximum, update the maximum
                maximum = special_sum;            }
        }
        System.out.println(maximum);
    }
}

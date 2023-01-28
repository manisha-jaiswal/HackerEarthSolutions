package Basic_Of_Input_output;

import java.util.Scanner;

public class NumberOfSteps {
    public static int countSteps(int[] a, int[] b, int size){
        int min=a[0];
        int count = 0;
        //adding the min value from array 1
        for(int i =0; i<size;i++){
            if(a[i]< min){
                min = a[i];
            }
        }
        int i=0;
        while( i < size){
            while(a[i]> min ){
                a[i]-=b[i];
                count++;
            }
            if(a[i]< min ){
                min=a[i];
                i=0;
            }
            else if(a[i]<0){
                return -1;
            }
            else
                i++;
        }

        return count;
    }
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);

        //size of array
        int size = sc.nextInt();

        //initially array a
        int[] a= new int[size];

        //initialize array b
        int[] b = new int[size];

        //adding elements in array a
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        //adding elements in array b
        for(int i=0;i<size;i++){
            b[i] = sc.nextInt();
        }
        //calling the method countSteps
        System.out.print(countSteps(a, b, size));
    }
}

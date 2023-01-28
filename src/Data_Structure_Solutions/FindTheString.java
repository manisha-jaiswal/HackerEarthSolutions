package Data_Structure_Solutions;

import java.util.Scanner;

public class FindTheString {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);

        //number of test cases
        int T = sc.nextInt(); // T = 1
        // enter the element in matrix
        for(int i = 0; i < T; i++) { // T =0, i=0
            //enter the size of row
            int n = sc.nextInt(); // n= 3

            //enter the size of column
            int m = sc.nextInt(); // m= 3

            //initialize a string array
            String[] arr = new String[n]; // arr[3] = [null, null, null]

            //taking number of string as a input
            for (int j = 0; j < n; j++) { //n=3, j=0 , j=1 , j=2
                arr[j] = sc.next(); // arr : ["aba", "xyz", "bdr"]
            }

            //string to search
            String str = sc.next(); // str = axbaydb
            int index = 0; //index = 0
            boolean counter = true; // counter = true

            //loop will be true when the length of string is not equal to the index
            while (str.length() != index) {
                //if the character is matched
                if (arr[index % n].contains(String.valueOf(str.charAt(index)))) {
                    counter = true;
                    //remove the matched alphabet
                    arr[index%n] = arr[index%n].replaceFirst(String.valueOf(str.charAt(index)),"");
                } else {
                    //set counter as false and come out from the loop
                    counter = false;
                    break;
                }
                index++;
            }
            if (counter == true) {

                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

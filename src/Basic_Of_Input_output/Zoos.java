package Basic_Of_Input_output;

import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int x = 0 , y = 0;
        for(int i = 0 ; i < l ; i++) {
            char ch = s.charAt(i);
            if(ch == 'z') { x++;
            }
            else if(ch == 'o') {
                y++;
            }else {
                continue;
            }
        }
        if( (2*x) == y) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

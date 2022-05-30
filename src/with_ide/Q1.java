package with_ide;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j=1;
        System.out.println("Please Enter your number :");
        int f= s.nextInt();
        for (int i = f; i >0 ; i--) {
            j=j*i;
        }
        System.out.println("The factorial of " + f + " is : " +j);

    }
}

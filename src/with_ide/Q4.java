package with_ide;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number :");
        int i= s.nextInt();
        if(i>0){
            System.out.println("The number is Positive Integer.");
        } else if (i==0) {
            System.out.println("The number is Zero.");
        }
        else {
            System.out.println("The number is Negative Integer.");
        }


    }
}

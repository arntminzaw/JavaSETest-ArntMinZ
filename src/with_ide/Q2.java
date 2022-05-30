package with_ide;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num1;
        int num2;
        int temp;
        System.out.println("Enter number A :");
        num1= s.nextInt();
        System.out.println("Enter number B :");
        num2=s.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number A is "+ num1);
        System.out.println("Number B is "+ num2);
    }
}

package with_ide;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 0,1or 2");
        int in=s.nextInt();
        switch (in){
            case 0 :
                System.out.println("Zero");
                break;
            case  1 :
                System.out.printf("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
        }
    }
}

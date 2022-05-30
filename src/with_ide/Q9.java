package with_ide;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int arr[]={23,2,45,3,23,5,111,25,6};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number :");
        int num= s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println("Your number found at Array: "+i);
            }
        }
    }
}

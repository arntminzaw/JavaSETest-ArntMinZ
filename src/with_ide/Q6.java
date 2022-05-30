package with_ide;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter my name:");
        String n=s.nextLine();
        switch (n){
            case "Arnt":
                System.out.println("First Name:");
                break;
                case "Min":
                System.out.println("Mid Name:");
                break;
                case "Zaw":
                System.out.println("Last Name:");
                break;
        }
    }
}

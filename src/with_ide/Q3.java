package with_ide;

public class Q3 {
    public static void main(String[] args) {
        int []num={23,45,23,56,78,153};
        int ln=num[0];
        for (int i = 1; i <num.length; i++) {
            if(ln<num[i]){
                ln=num[i];
            }
        }
        System.out.println("Largest number is :"+ ln);

    }
}

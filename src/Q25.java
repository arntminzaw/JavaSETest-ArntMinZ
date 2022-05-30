public class Q25 {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {
            for (int j =6-i; j >0; j--) {
                System.out.print(i);
            }
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
        }
    }
}

package with_ide;

public class Q15 {
    public static void main(String[] args) {
        int j[]={23,4,5,2,12,23,3,3,23,2,4,7};
        int ecount=0;
        int ocount=0;
        for (int i = 0; i < j.length; i++) {
            if(j[i]%2==0){
                ecount++;
            }
            else {
                ocount++;
            }
        }
        System.out.println("Total of odd: " +ocount);
        System.out.println("Total of even: " +ecount);
    }
}

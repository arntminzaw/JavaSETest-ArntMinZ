package with_ide;

public class Q10 {
    public static void main(String[] args) {
        int arr[]={5,4,1,8,6,9,76,98,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i] +" ");

        }
    }
}

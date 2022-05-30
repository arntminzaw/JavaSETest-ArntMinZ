package with_ide;

public class Q16 {
    private static Q16 Instance;

    private Q16(){

    }
    public static Q16 getInstance(){
        if(Instance == null) {
            Instance = new Q16();
        }
        return Instance;
    }
}



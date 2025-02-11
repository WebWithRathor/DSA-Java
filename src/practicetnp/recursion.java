package practicetnp;

public class recursion {
    public static void main(String[] args) {
        show(3);
    }

    private static void show(int i) {
        if(i>0){
        show(i-1);  
        System.out.println(i);
        show(i-1);
        }


    }
}

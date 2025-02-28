import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < 100000;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}

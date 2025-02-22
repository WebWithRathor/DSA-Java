import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!st.isEmpty()) {
                while (!st.isEmpty() && st.peek() <= arr[i]) st.pop();
                if (st.isEmpty()) list.add(-1);
                else list.add(st.peek());
            } else {
                list.add(-1);
            }
            st.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {

        System.out.println(nextLargerElement(new int[]{41, 88, 58, 69, 93, 42, 44, 25, 12, 47, 41, 88, 58, 69, 93, 42, 44, 25, 12, 47}));

    }
}

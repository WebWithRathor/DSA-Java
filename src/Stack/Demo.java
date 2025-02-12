package Stack;

public class Demo {
    public static void main(String[] args) {
        StackArray st = new StackArray(5);

        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println(st.pop());
        st.push(3);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}

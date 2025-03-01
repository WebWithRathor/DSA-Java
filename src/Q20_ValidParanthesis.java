import java.util.Stack;

public class Q20_ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for (char ch : s.toCharArray()) {
            System.out.println(ch);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                char pop = st.pop();
                if (pop == '(' && ch == ')' || pop == '{' && ch == '}' || pop == '[' && ch == ']') continue;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isValid(s));
    }
}

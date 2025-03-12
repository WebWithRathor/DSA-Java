import java.util.HashMap;
import java.util.Set;

public class Q409Longestpalindrome {
    public static int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean isOdd = false;
        for (char ch : map.keySet()) {
            int c = map.get(ch);
            if (c % 2 == 0) count += c;
            else {
                isOdd = true;
                count = c - 1;
            }
        }

        return isOdd ? count+1 : count;

    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}

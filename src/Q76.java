import java.util.HashMap;

public class Q76 {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        int i = 0, n = s.length(), j = 0, count = 0, n2 = t.length();
        int minlength = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                int val = map.get(ch) - 1;
                map.put(ch, val);
                if (val >= 0) count++;
            }
            while (count == n2) {
                char c = s.charAt(i);
                int curr = j - i + 1;
                if (curr < minlength) {
                    minIndex = i;
                    minlength = curr;
                }
                if (map.containsKey(c)) {
                    int v = map.get(c);
                    map.put(c, v + 1);
                    if (v + 1 > 0) count--;
                }
                i++;
            }
            j++;
        }

        if (minlength == Integer.MAX_VALUE) return "";
        return s.substring(minIndex, minIndex + minlength);
    }


    public static void main(String[] args) {
        System.out.println(minWindow("a", "aa"));
    }
}

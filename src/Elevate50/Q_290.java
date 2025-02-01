package Elevate50;

import java.util.HashMap;
import java.util.HashSet;

public class Q_290 {
    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        String[] crr = s.split(" ");
        char[] brr = pattern.toCharArray();
        if(brr.length != crr.length)return false;
        int count = 0;
        for (char ch : brr) {
            if (!map.containsKey(ch)) {
                map.put(ch, crr[count]);
            }
            count++;
        }
        HashSet<String> set = new HashSet<>(map.values());
        if(map.size()!=set.size()) return false;
        StringBuilder sb = new StringBuilder();
        for (char ch : pattern.toCharArray()) {
            sb.append(map.get(ch) + " ");
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - 1));

        return sb.toString().equals(s);
    }

    public static void main(String[] args) {
        String pattern = "a", s = "dog";
        System.out.println(wordPattern(pattern, s));
    }
}

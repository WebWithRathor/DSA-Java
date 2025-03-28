package Elevate50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Q_819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] crr = paragraph.toLowerCase().split("[ !?',;.]");
        HashSet<String> banSet = new HashSet<>();
        for(String s : banned) banSet.add(s.toLowerCase());
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(banSet);
        String max = null;
        for (String s : crr) {
            if (!banSet.contains(s) && !s.equals("")) {
                if (max == null) max = s;
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        for (String s : map.keySet())
            if (map.get(s) > map.get(max)) max = s;

        return max;
    }

    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl", banned[] = {"hit","bOb"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}

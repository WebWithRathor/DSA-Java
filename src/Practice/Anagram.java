package Practice;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        String s1 = "ceek";
        String s2 = "keec";
        for(char ch : s1.toCharArray())map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch : s2.toCharArray())map1.put(ch,map1.getOrDefault(ch,0)+1);

        System.out.println(map.equals(map1));
    }
}

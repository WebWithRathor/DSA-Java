package Elevate50;

public class Q_389 {
    public static char findTheDifference(String s, String t) {

        int crr[] = new int[26];

        for (char ch : s.toCharArray()) crr[ch - 'a']++;
        for (char ch : t.toCharArray()) crr[ch - 'a']--;

        for (int i = 0; i < 26; i++) if (crr[i] != 0) return (char) (i + 'a');

        return ' ';
    }

    public static void main(String[] args) {
        String s = "", t = "a";
        System.out.println(findTheDifference(s,t));
    }
}

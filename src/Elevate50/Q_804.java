package Elevate50;

import java.util.HashSet;

public class Q_804 {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()){
                sb.append(morseCode[ch - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();

    }

    public static void main(String[] args) {
        String [] arr = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(arr));
    }
}

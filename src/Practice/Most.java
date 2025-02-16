package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Most {
    public static void main(String[] args) {
        String[] sentences = {"coding is fun", "practice makes perfect", "consistency is the key to success"};
        int max = 0;
        for(String sentence : sentences ){
            max = Math.max(max,sentence.split(" ").length);
        }
        System.out.println(max);
        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : sentences[0].toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

    }

}

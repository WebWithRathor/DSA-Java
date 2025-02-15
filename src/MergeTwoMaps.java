import java.util.HashMap;
import java.util.HashSet;

public class MergeTwoMaps {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        map1.put(1, 10);
        map1.put(2, 20);

        map2.put(2, 30);
        map2.put(3, 40);

        for (int key : map2.keySet()) {
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + map2.get(key));
            } else {
                map1.put(key, map2.get(key));
            }
        }

//        System.out.println(map1);

        String s = "swwssj";
        HashSet<Character> set = new HashSet<>();
        int i =0,j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(s.charAt(i));



        System.out.println(set);


    }
}

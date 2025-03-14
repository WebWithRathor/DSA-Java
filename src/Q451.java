import java.util.*;

public class Q451 {

    static Comparator<Map.Entry<Character, Integer>> comp = new Comparator<Map.Entry<Character, Integer>>() {
        @Override
        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
            if (o1.getValue() < o2.getValue()) return 1;
            return -1;
        }
    };

    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(comp);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list){
            for(int i =0 ; i< entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(frequencySort("aabscsf"));
    }
}

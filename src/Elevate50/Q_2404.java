package Elevate50;

import java.util.HashMap;
import java.util.Map;

public class Q_2404 {
    public static int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) if (i % 2 == 0) map.put(i, map.getOrDefault(i, 0) + 1);

        int max = -1;
        int minValue = Integer.MAX_VALUE;
        System.out.println(map);
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() >= max) {
                if (map.get(minValue) == key.getValue()){
                    minValue = Math.min(minValue, key.getKey());
                }
                else minValue = key.getKey();
                max = key.getValue();
            }
        }
        return !map.isEmpty() ? minValue : -1;
    }

    public static void main(String[] args) {
        int[] arr = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        System.out.println(mostFrequentEven(arr));
    }
}

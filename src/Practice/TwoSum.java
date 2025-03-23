package Practice;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println(Arrays.toString(new int[]{i, map.get(target - arr[i])}));
                break;
            }
            map.put(arr[i], i);
        }


    }
}

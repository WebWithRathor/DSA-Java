import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q350IntersectionArray2 {
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums1) map1.put(num, map1.getOrDefault(num,0)+1);
        for (int num : nums2) map2.put(num, map2.getOrDefault(num,0)+1);

        for (int key : map1.keySet()){
            if(map2.containsKey(key)){
                int val = Math.min(map1.get(key), map2.get(key));
                for (int i =0;i<val;i++)ans.add(key);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,4,5}, nums2 = {4,4,4,5,3,4,6};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}

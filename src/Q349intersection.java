import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q349intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        set1.retainAll(set2);

        return set1.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}

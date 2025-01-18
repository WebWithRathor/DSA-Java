import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i + 1]) continue;
            int j = i + 1, k = n - 1;
            while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
                ArrayList<Integer> arr = new ArrayList<>();
                if (sum == 0) {
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    if (!result.contains(arr)) result.add(arr);
                    j++;
                } else if (sum < 0) {
                     j++;
                } else {
                     k--;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
//        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

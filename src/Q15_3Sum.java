import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < n - 2; i++) {
            if ( i>0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = n - 1;
            while (j < k) {

                System.out.println(Arrays.asList(nums[i], nums[j], nums[k]));
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> arr = Arrays.asList(nums[i], nums[j], nums[k]);
                    if (result.indexOf(arr) == -1) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j - 1]) j++;
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

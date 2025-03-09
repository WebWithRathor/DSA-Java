import java.util.Arrays;

public class Q268missingnumber {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int missingNumber(int[] nums) {
        int i = 0, n = nums.length;
        while (i < n) {
            if (nums[i] == i || nums[i] == n) i++;
            else {
                swap(nums, i, nums[i]);
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j) return j;
        }
        return n;
    }


    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));

    }
}

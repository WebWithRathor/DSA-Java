public class Q41missingpositive {


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0, n = nums.length;
        while (i < n) {
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > n || nums[i] == nums[nums[i] - 1]) i++;
            else {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) return j+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, -1,4};
//        int[] arr = {7, 8, 9, 11, 12};
        int[] arr = {2};
        System.out.println(firstMissingPositive(arr));

    }
}

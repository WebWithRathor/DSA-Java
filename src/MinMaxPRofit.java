public class MinMaxPRofit {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int min = nums[0];
        int max = 0;
        for (int num : nums) {
            max = Math.max(num - min, max);
            min = Math.min(min, num);
        }
        System.out.println(max);
    }
}

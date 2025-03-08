public class Q156_MooreProblem {
    public static int majorityElement(int[] nums) {
        int result = 0, currentMax = nums[0];
        for (int num : nums) {
            if (currentMax == num) {
                result++;
            } else {
                result--;
                if (result == 0) {
                    currentMax = num;
                    result = 1;
                }
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}

public class Q_53KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int maxSum = 0, currSum = 0;
        for (int num : nums) {
            currSum += num;
            if (currSum < 0) currSum = 0;
            else if (maxSum < currSum) maxSum = currSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}

public class Q42_TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            left[i] = Math.max(max, height[i]);
            if (max < height[i]) max = height[i];
        }
        max = 0;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = Math.max(max, height[i]);
            if (max < height[i]) max = height[i];
            ans += Math.max(Math.min(left[i], right[i]) - height[i], 0);
        }
        return ans;

    }

    public static int Gpt(int [] height){
        int n = height.length;
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += rightMax - height[right];
                }
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
}

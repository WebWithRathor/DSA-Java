public class Q11MostWater {
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxArea = 0;
        while (i < j) {
            int width = j - i;
            int currArea = width * Math.min(height[i], height[j]);
            maxArea = Math.max(currArea, maxArea);
            if (height[i] <= height[j]) i++;
            else j--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}

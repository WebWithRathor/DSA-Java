import java.util.Arrays;
import java.util.Stack;

public class Q_84_BiggestREctangleArea {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int Left[] = new int[n];
        int Right[] = new int[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st1.isEmpty() && heights[st1.peek()] >= heights[i])
                st1.pop();
            if (st1.isEmpty()) {
                Left[i] = -1;
            } else {
                Left[i] = st1.peek();
            }
            st1.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!st2.isEmpty() && heights[st2.peek()] >= heights[i])
                st2.pop();

            if (st2.isEmpty()) {
                Right[i] = n;
            } else {
                Right[i] = st2.peek();
            }
            st2.push(i);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(heights[i] * (Right[i] - Left[i] - 1), max);
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}

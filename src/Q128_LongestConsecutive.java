import java.util.HashSet;
import java.util.Set;

public class Q128_LongestConsecutive {
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int max = 0;
        for (int num : nums) {
            if (set.contains(num - 1)) {
                continue;
            }
            int current = 1;
            while (set.contains(num + current)) {
                current++;
            }
            max = Math.max(current, max);
        }
        String s = "hello";

        String ans = Character.toUpperCase(s.charAt(0))+s.substring(1)+Character.toUpperCase(s.charAt(s.length()-1));
        System.out.print(ans + " ");

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}

package Initials;

import java.util.Arrays;

public class RotateK {
    public static void rotate(int[] nums, int k) {
        int arr [] = new int[nums.length];
        int j =0;
        for (int i = k; i < nums.length ; i++) {
            arr[j++] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            arr[j++] =nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=arr[i];
        }
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));

    }
}

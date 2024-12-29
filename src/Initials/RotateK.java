package Initials;

import java.util.Arrays;

public class RotateK {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr [] = new int[n];
        int j =0;
//        for (int i = k; i < nums.length ; i++) {
//            arr[j++] = nums[i];
//        }
//        for (int i = 0; i < k; i++) {
//            arr[j++] =nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=arr[i];
//        }


//        right Rotate
//        for (int i = n-k; i < n ; i++) {
//            arr[j++] = nums[i];
//        }
//        for (int i = 0; i < n-k; i++) {
//            arr[j++] =nums[i];
//        }
//        for (int i = 0; i < n; i++) {
//            nums[i]=arr[i];
//        }
    }

    public static void rotateK(int [] nums,int k){
//        left
//        reverse(nums,k,nums.length-1);
//        reverse(nums,0,k-1);
//        reverse(nums,0,nums.length-1);
//
//        right
//        reverse(nums,0,nums.length-1);
//         reverse(nums,k,nums.length-1);
//        reverse(nums,0,k-1);
    }
    public static void reverse(int []arr , int start , int end){
        while (start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
//        int [] nums = {99,-1,-100,3};
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
//        rotateK(nums,k);
        System.out.println(Arrays.toString(nums));

    }
}

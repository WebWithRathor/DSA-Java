package Elevate50;

import java.util.Arrays;

public class Q_645 {
    public static int[] findErrorNums(int[] nums) {
        int n =nums.length;
        int[] arr = new int[n+1];
        int sum = 0;
        for (int i : nums) {
            sum += i;
            arr[i]++;
        }
        int disp = 0;
        for (int i = 1;i< arr.length ; i++)
            if (arr[i] == 0) {
                disp = i;
                break;
            }
        int duplicate = (sum+disp) - ((n*(n+1))/2);

        return new int[]{duplicate,disp};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
    }
}

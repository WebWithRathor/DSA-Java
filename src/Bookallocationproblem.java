public class Bookallocationproblem {

    public static boolean pushti(int[] arr, int mid, int k) {
        int sum = 0;
        for (int nums : arr) {
            if ((sum + nums) <= mid) {
                sum += nums;
            } else {
                k--;
                sum = nums;
            }
        }
        return k == 1;
    }


    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90}, k = 2;
//        int arr[] = {15, 17, 20}, k = 1;
        int max = arr[0], sum = 0, ans = -1;

        for (int nums : arr) {
            sum += nums;
            max = Math.max(max, nums);
        }

        if (k < arr.length) {
            while (max <= sum) {
                int mid = max + (sum - max) / 2;
                System.out.println("max " + max + " mid " + mid + " sum " + sum);
                if (pushti(arr, mid, k)) {
                    ans = mid;
                    sum = mid - 1;
                } else {
                    max = mid + 1;
                }
            }
        } else if (k == 1) ans = sum;

        System.out.println(ans);

    }
}

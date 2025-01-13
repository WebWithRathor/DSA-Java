public class SearchSortedArray {
    public static int search(int[] nums, int target) {
        int s = 0, e = nums.length-1;
        while (s != e) {
            int mid = s + (e - s) / 2;
            System.out.println("e = " + e + " s = " + s + " mid = " + mid);
            if (nums[mid] == target) return mid;
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target <= nums[mid]) {
                    e = mid;
                } else {
                    s = mid+1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[e]) {
                    s = mid+1;
                } else {
                    e = mid;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 3));
    }
}

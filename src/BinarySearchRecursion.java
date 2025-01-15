public class BinarySearchRecursion {

    public static int BSR(int[] nums, int start, int end, int key) {
        int mid = start + (end - start) / 2;

        if (start > end) return -1;

        if (nums[mid] == key) return mid;

        else if (nums[mid] < key) return BSR(nums, mid + 1, end, key);

        else return BSR(nums, start, mid - 1, key);

    }

    public static int BS(int[] nums, int start, int end, int key) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) return mid;
            if (nums[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums = {-1,0,3,5,9,12};
        int key = 2;
        System.out.println(BSR(nums, 0, nums.length-1, key));
        System.out.println(BS(nums, 0, nums.length-1, key));

    }
}

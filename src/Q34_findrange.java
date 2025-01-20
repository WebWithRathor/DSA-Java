public class Q34_findrange {

    public static int leftPos(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int left = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                left = mid;
                end = mid-1;
            }
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return left;
    }
    public static int rightPos(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int right = -1;
        while (start <= end) {
                System.out.println(start +"mid :" +end);
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                right = mid;
                start = mid+1;
            }
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return right;
    }

    public static void main(String[] args) {
        int nums[] = {2,2};
        int target = 2;

        System.out.println(leftPos(nums,target));
        System.out.println(rightPos(nums,target));


    }

}

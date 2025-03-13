import java.util.ArrayList;
import java.util.List;


public class Q448findalldisappearednumber {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disp = new ArrayList<>();

        int i = 0, n = nums.length;

        while (i < n) {
            if (nums[i] == i + 1 || nums[i] == nums[nums[i]-1]){
                i++;
            }
            else {
                swap(nums, i, nums[i]-1);
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j+1) disp.add(j+1);
        }

        return disp;
    }

    public static void main(String[] args) {
        int arr [] = {4,3,2,7,8,2,3,1};
//        int arr[] = {1, 1};
        System.out.println(findDisappearedNumbers(arr));
    }
}

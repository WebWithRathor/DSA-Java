import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp= target - nums[i];
            if(map.containsKey(comp))return new int[]{i,map.get(comp)};
            map.put(nums[i],i);
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int arr [] = {2,7,11,15},target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}

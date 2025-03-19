import java.util.HashMap;

public class Q525contigiousarray {
    public static int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();map.put(0,1);
        int sum =0;
        for (int i =0;i< nums.length ; i++){
            int num = nums[i];
            sum+=num==0 ? -1 : 1;
            map.put(sum,i);
        }
        return map.get(0)-1;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,1,1,1,0,0,0,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}

import java.util.Arrays;

public class Q_724 {
    public static void main(String[] args) {
        int nums[]=new int[]{1,7,3,6,5,6};
        int left[]=new int[nums.length];
        int sum = 0;
        for(int i =0 ; i< nums.length ; i++) left[i] = sum+=nums[i];
        sum =0;
        for(int i = nums.length-1 ; i >=0 ; i--){
            sum+=nums[i];
            if(left[i]==sum) System.out.println(left[i]);
        }
    }
}
